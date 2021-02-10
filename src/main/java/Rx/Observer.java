package Rx;

public interface Observer<T> {

    void onSubscribe();

    void onNext(T t);

    void onError(Throwable t);

    void onComplete();
}
