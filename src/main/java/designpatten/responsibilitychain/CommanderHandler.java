package designpatten.responsibilitychain;

/**
 * Created by shuo.sun on 2021/3/21.
 */
public class CommanderHandler extends Handler {

    public CommanderHandler(Handler next) {
        super(next);
    }

    @Override
    protected void handleRequest(Request request) {
        if (RequestType.DEFEND_CASTLE == request.getRequestType()) {
            printResult(request);
        } else {
            super.next(request);
        }
    }
}
