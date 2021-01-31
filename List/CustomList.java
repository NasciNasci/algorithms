package List;

public class CustomList<T> {
    private class Node {
        private Node node;
        private T value;

        public Node() {
            this.node = null;
            this.value = null;
        }
    }

    private Node header;

    public CustomList() {
        this.header = null;
    }

    public void add(T value) {
        Node actual = this.header;
        if (actual == null) {
            this.header = new Node();
            this.header.node = new Node();
            this.header.node.value = value;
            return;
        }

        actual = actual.node;
        while (actual.node != null) {
            actual = actual.node;
        }

        actual.node = new Node();
        actual.node.value = value;
    }

    public T retrieve(int index) {
        Node actual = this.header;
        if (actual == null) {
            return null;
        }

        actual = actual.node;
        for (int i = 0; i < index; i++) {
            if (actual == null) {
                break;
            }

            actual = actual.node;
        }

        if (actual == null) {
            return null;
        }

        return actual == null ? null : actual.value;
    }

    public void change(int index, T value) {
        Node actual = this.header;
        if (actual == null) {
            return;
        }

        actual = actual.node;
        for (int i = 0; i < index; i++) {
            if (actual == null) {
                break;
            }

            actual = actual.node;
        }

        if (actual == null) {
            return;
        }

        actual.value = value;
    }

    public void remove(int index) {
        Node actual = this.header;
        if (actual == null) {
            return;
        }

        for (int i = 0; i < index; i++) {
            if (actual == null) {
                break;
            }

            actual = actual.node;
        }

        if (actual == null) {
            return;
        }

        actual.node = actual.node == null ? null : actual.node.node;
    }
}