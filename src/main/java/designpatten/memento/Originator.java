package designpatten.memento;

public class Originator {

    private int money = 10;

    public IMemento createMemento() {
        return new MementoImp();
    }

    public void saveMoney(IMemento memento) {
        ((MementoImp) memento).setState(money);
    }

    public void recoverFromMemento(IMemento memento) {
        this.money = ((MementoImp) memento).getState();
        System.out.println("money:" + money);
    }

    public void makeMoney() {
        money++;
    }

    private class MementoImp implements IMemento {

         int money = 10;

        private void setState(int money) {
            this.money = money;
        }

        private int getState() {
            return money;
        }
    }
}
