package Rx;

/**
 * Created by shuo.sun on 2021/2/10.
 */
public abstract class AbstractObservableWithUpstream<T,U> extends Observable<U> {

    final ObservableSource<T> source;

    public AbstractObservableWithUpstream(ObservableSource<T> source) {
        this.source = source;
    }
}
