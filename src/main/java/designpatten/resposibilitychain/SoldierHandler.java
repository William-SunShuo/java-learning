package designpatten.resposibilitychain;

/**
 * Created by shuo.sun on 2021/3/21.
 */
public class SoldierHandler extends Handler {

    public SoldierHandler(Handler next) {
        super(next);
    }

    @Override
    protected void handleRequest(Request request) {
        if (RequestType.COLLECT_TAX == request.getRequestType()) {
            printResult(request);
        } else {
            super.next(request);
        }
    }
}
