package Rx;

/**
 * Created by shuo.sun on 2021/2/10.
 */
public final class ObservableCreate<T> extends Observable<T> {

    final ObservableOnSubscribe<T> source;

    public ObservableCreate(ObservableOnSubscribe<T> source) {
        this.source = source;
    }

    @Override
    protected void subscribeActual(Observer<T> observer) {
        CreateEmitter createEmitter = new CreateEmitter(observer);
        observer.onSubscribe();
        try {
            source.subscribe(createEmitter);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    private final class CreateEmitter implements Emitter<T>{

        Observer<T> observer;

        public CreateEmitter(Observer<T> observer) {
            this.observer = observer;
        }

        @Override
        public void onNext(T value) {
            observer.onNext(value);
        }

        @Override
        public void onError(Throwable error) {
            observer.onError(error);
        }

        @Override
        public void onComplete() {
           observer.onComplete();
        }
    }


}