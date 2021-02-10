package Rx;

/**
 * Created by shuo.sun on 2021/2/10.
 */
public interface ObservableSource<T> {

    void subscribe(Observer<T> observer);
}
