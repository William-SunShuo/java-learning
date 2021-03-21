package designpatten.responsibilitychain;

/**
 * Created by shuo.sun on 2021/3/21.
 */
public class Request {

    private final RequestType requestType;
    private final String requestDescription;
    private boolean handled;

    public Request(RequestType requestType, String requestDescription) {
        this.requestType = requestType;
        this.requestDescription = requestDescription;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    @Override
    public String toString() {
        return requestDescription;
    }
}
