package designpatten.responsibilitychain;

/**
 * Created by shuo.sun on 2021/3/21.
 */
public abstract class Handler {

    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    protected abstract void handleRequest(Request request);

    protected void next(Request request){
        if(next != null){
            next.handleRequest(request);
        }
    }

    protected void printResult(Request request){
        System.out.println(this + "-------------handled--------------" + request);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
