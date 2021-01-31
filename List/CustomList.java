package List;

public class CustomList<T> {
    private class Node<T> {
        private Node<T> node;
        private T value;

        public Node() {
            this.node = null;
            this.value = null;
        }
    }

    private Node<T> header;

    public CustomList() {
        this.header = null;
    }

    public void add(T value) {
        if (this.header == null) {
            this.header = new Node<>();
            this.header.value = value;
            return;
        }

        Node<T> actual = this.header;
        while (actual.node != null) {
            actual = actual.node;
        }

        actual.node = new Node<>();
        actual.node.value = value;
    }

    public void retrieve(int index) {

    }

    public void change(int index, T value) {

    }

    public void remove(int index) {

    }
}