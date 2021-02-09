package generic;

import entity.Coffee;

/**
 * Created by shuo.sun on 2021/2/9.
 */
public class BasicGenerator<T> implements Generator<T> {

    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;

    }

    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> Generator<T> create(Class<T> type) {
        return new BasicGenerator<>(type);
    }

    public static void main(String[] args) {
        Generator<Coffee> generator = BasicGenerator.create(Coffee.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(generator.next());
        }
    }
}
