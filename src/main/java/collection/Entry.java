package collection;

public class Entry<K, V> {

    K k;
    V v;
    Entry<K, V> next;

    public Entry(K k, V v, Entry<K, V> next) {
        this.k = k;
        this.v = v;
        this.next = next;
    }

    public K getKey() {
        return k;
    }

    public V getValue() {
        return v;
    }
}
