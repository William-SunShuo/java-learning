package Rx;

/**
 * Created by shuo.sun on 2021/2/10.
 */
public interface ObservableOnSubscribe<T> {

    void subscribe(Emitter<T> emitter) throws Throwable;
}
