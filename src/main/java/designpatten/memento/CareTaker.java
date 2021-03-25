package designpatten.memento;
import collection.HashMap;
import collection.Map;

public class CareTaker {

    private Map<String, IMemento> mementos = new HashMap<>();

    public IMemento getMemento(String key) {
        return mementos.get(key);
    }

    public void saveMemento(String key, IMemento memento) {
        mementos.put(key, memento);
    }
}
