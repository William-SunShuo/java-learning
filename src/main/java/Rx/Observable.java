package Rx;

public abstract class Observable<T> {

    public static <T> Observable<T> create(Observable<T> observable) {
        return observable;
    }

    abstract void subScribe(Observer<T> observer);

    <R> Observable<R> map(Function<T, R> function) {
        return new Observable<R>() {
            @Override
            void subScribe(Observer<R> observer) {
                Observer<T> observer1 = new Observer<T>() {
                    @Override
                    public void onNext(T t) {
                        R r = function.apply(t);
                        observer.onNext(r);
                    }

                    @Override
                    public void onError() {
                        observer.onError();
                    }

                    @Override
                    public void onComplete() {
                        observer.onComplete();
                    }
                };
                Observable.this.subScribe(observer1);
            }
        };
    }
}
