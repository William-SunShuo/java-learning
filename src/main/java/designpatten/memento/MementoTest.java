package designpatten.memento;

public class MementoTest {

    /**
     * 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
     * @param args
     */
    public static void main(String[] args) {
        Originator originator = new Originator();
        int j = 10;
        for (int i = 0; i < j; i++) {
            originator.makeMoney();
        }
        IMemento memento = originator.createMemento();
        originator.saveMoney(memento);
        CareTaker careTaker = new CareTaker();
        careTaker.saveMemento("money", memento);
        originator.recoverFromMemento(careTaker.getMemento("money"));
    }
}
