package collection;

public class HashMap<K, V> implements Map<K, V> {

    //数组默认长度
    private int defaultLength;

    //默认负载因子
    private double defaultAddFactor;

    //使用长度
    private double useSize;

    //entry数组

    Entry<K, V>[] entries;

    public HashMap(int defaultLength, double defaultAddFactor) {
        if (defaultLength < 0) {
            throw new RuntimeException("长度错误");
        }
        if (defaultAddFactor <= 0 || Double.isNaN(defaultAddFactor)) {
            throw new RuntimeException("负载因子错误");
        }
        this.defaultLength = defaultLength;
        this.defaultAddFactor = defaultAddFactor;
        entries = new Entry[this.defaultLength];
    }

    public HashMap() {
        this(16, 0.75);
    }

    /**
     * 计算hashcode
     *
     * @param hashCode
     * @return
     */
    private int hash(int hashCode) {
        hashCode = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        return hashCode ^ ((hashCode >>> 7) ^ (hashCode >>> 4));
    }

    /**
     * 获取保存位置的数组下标
     */
    private int getIndex(K k, int length) {
        int m = length - 1;
        int index = hash(k.hashCode()) & m;
        return index > 0 ? index : -index;
    }

    @Override
    public V put(K k, V v) {
        // 判断是否需要库容
        if (this.useSize > this.defaultAddFactor * this.defaultLength) {
            this.dilatation();
        }

        // 计算出当前下标
        int index = this.getIndex(k, this.defaultLength);

        // 获取下标上的entry
        Entry<K, V> e = this.entries[index];

        // 创建一个新的 newEntry
        Entry<K, V> newEntry = new Entry<>(k, v, null);

        // 判断当前下标是否被使用，如果没有被使用就将newEntry填入
        if (e == null) {
            this.entries[index] = newEntry;
            // 使用后 使用长度+1
            this.useSize++;
        } else {
            // -否则
            while (true) {
                if (e.getKey() == k || e.getKey().equals(k)) {
                    e.v = v;
                    break;
                }
                if (e.next != null) {
                    e = e.next;
                } else {
                    e.next = newEntry;
                    break;
                }
            }
        }
        return newEntry.getValue();
    }

    @Override
    public V get(K k) {
        // 获取当前下标
        int index = this.getIndex(k, this.entries.length);

        // 得到下标上的entry
        Entry<K, V> entry = this.entries[index];

        while (entry != null) {
            // key相等就返回
            if (entry.getKey() == k || entry.getKey().equals(k)) {
                break;
            }
            entry = entry.next;// 如果不相等，将next赋值给entry继续循环
        }

        // 找不到就返回null
        return entry != null ? entry.getValue() : null;
    }

    /**
     * 扩容
     */
    private void dilatation() {
        this.defaultLength = this.defaultLength * 2;// 重新设置默认长度
        this.useSize = 0;// 使用长度重置为0
        Entry<K, V>[] tempEntries = this.entries;
        this.entries = new Entry[this.defaultLength];
        Entry<K, V> temp;
        for (int i = 0; i < tempEntries.length; i++) {
            Entry<K, V> entry = tempEntries[i];
            // 判断数组下标上的entry!=null
            while (entry != null) {
                put(entry.getKey(), entry.getValue());// 调用put方法,传入entry.k entry.v
                temp = entry.next;
                entry.next = null;
                entry = temp;
            }
        }
    }

    /**
     * 测试
     *
     * @param args
     */
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 100; i++) {
            map.put("" + i, i);
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("\t key:" + i + "\t value:" + map.get("" + i));
        }
    }

}
