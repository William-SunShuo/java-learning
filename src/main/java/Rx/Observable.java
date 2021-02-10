package Rx;

public abstract class Observable<T> implements ObservableSource<T> {

    public static <T> Observable<T> create(ObservableOnSubscribe<T> source) {
        return new ObservableCreate<>(source);
    }

    @Override
    public final void subscribe(Observer<T> observer) {
        subscribeActual(observer);
    }

    protected abstract void subscribeActual(Observer<T> observer);

    public final <R> Observable<R> map(Function<T, R> mapper) {
        return new ObservableMap<>(this, mapper);
    }

}
