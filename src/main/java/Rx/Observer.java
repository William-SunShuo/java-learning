package Rx;

public interface Observer<T> {

    void onNext(T t);

    void onError();

    void onComplete();
}
