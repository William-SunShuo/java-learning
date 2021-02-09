package generic;

public class LinkedStack<T> {

    private class Node {
        T item;  //证明内部类可以访问其外部类的类型参数
        Node next;

        Node() {
        }

        Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }
    }

    private Node top = new Node();

    public void push(T item) {
        top = new Node(item, top);
    }

    public T pop() {
        T item = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return item;
    }

    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<>();
        for (String s : "Phasers on stun!".split(" ")) {
            lss.push(s);
        }
        String s;
        while ((s = lss.pop()) != null) {
            System.out.println(s);
        }
    }
}
