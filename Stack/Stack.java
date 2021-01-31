package Stack;

public class Stack<T> {
    private class Node {
        private Node node;
        private T value;

        public Node() {
            this.node = null;
            this.value = null;
        }
    }

    private Node header;

    public void push(T value) {
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

    public void pop() {
        Node actual = this.header;
        if (actual == null) {
            return;
        }

        while (actual.node != null && actual.node.node != null) {
            actual = actual.node;
        }

        actual.node = null;
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

        return actual.value;
    }
}
