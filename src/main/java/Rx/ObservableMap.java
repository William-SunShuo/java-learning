package Rx;

/**
 * Created by shuo.sun on 2021/2/10.
 */
public final class ObservableMap<T,U> extends AbstractObservableWithUpstream<T,U> {

    final Function<? super T, ? extends U> function;


    public ObservableMap(ObservableSource<T> source, Function<? super T, ? extends U> function) {
        super(source);
        this.function = function;
    }

    @Override
    protected void subscribeActual(Observer<U> observer) {
        source.subscribe(new MapObserver<>(function,observer));
    }


    static final class MapObserver<T, U> implements Observer<T>{

        Observer<U> observer;
        final Function<? super T, ? extends U> mapper;

        public MapObserver(Function<? super T, ? extends U> mapper, Observer<U> observer) {
            this.mapper = mapper;
            this.observer = observer;
        }

        @Override
        public void onSubscribe() {

        }

        @Override
        public void onNext(T t) {
            U u = mapper.apply(t);
            observer.onNext(u);
        }

        @Override
        public void onError(Throwable t) {

        }

        @Override
        public void onComplete() {

        }
    }
}
