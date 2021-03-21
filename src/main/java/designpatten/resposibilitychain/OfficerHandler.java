package designpatten.resposibilitychain;


/**
 * Created by shuo.sun on 2021/3/21.
 */
public class OfficerHandler extends Handler {

    public OfficerHandler(Handler next) {
        super(next);
    }

    @Override
    protected void handleRequest(Request request) {
        if (RequestType.TORTURE_PRISONER == request.getRequestType()) {
            printResult(request);
        } else {
            super.next(request);
        }
    }
}
