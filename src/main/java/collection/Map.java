package collection;

public interface Map<K, V> {

    V put(K k, V v);

    V get(K k);
}
