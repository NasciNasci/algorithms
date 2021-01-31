package List;

public class CustomList<T> {
    private class Node<T> {
        private Node<T> node;
        private T value;
    }

    private Node<T> next;

    public void add(T value) {
        if (this.next == null) {
            this.next = new Node<>();
            this.next.value = value;
        }

        Node<T> actual = this.next;
        while (actual != null) {
            actual = actual.node;
        }

        actual = new Node<>();
        actual.value = value;
    }

    public void retrieve(int index) {

    }

    public void change(int index, T value) {

    }

    public void remove(int index) {

    }
}