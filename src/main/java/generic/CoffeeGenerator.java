package generic;
import entity.*;
import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Generator<Coffee> ,Iterable<Coffee>{

    private int size = 0 ;
    private Class[] types = {Latte.class, Mocha.class, Cappuccino.class, Americano.class,Breve.class};
    private static Random random = new Random(47);

    public CoffeeGenerator(int size){
        this.size = size;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    private class CoffeeIterator implements Iterator<Coffee> {

        private int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count -- ;
            return CoffeeGenerator.this.next();
        }
    }

    public static void main(String[] args){
        for(Coffee c: new CoffeeGenerator(5)){
            System.out.println(c);
        }
    }
}
