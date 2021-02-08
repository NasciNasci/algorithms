package dataStructures.List;

public class CustomList<T> {
    protected class Node {
        public Node node;
        public T value;

        public Node() {
            this.node = null;
            this.value = null;
        }
    }

    protected Node head;
    protected int size;

    public CustomList() {
        this.head = null;
        this.size = 0;
    }

    public void insert(T value) {
        this.head = this.insert(value, this.head);
        this.size++;
    }

    private Node insert(T value, Node actualNode) {
        if (actualNode == null) {
            Node newNode = new Node();
            newNode.value = value;

            return newNode;
        } else {
            actualNode.node = this.insert(value, actualNode.node);
        }

        return actualNode;
    }

    public T retrieve(int index) {
        return this.retrieve(index, 0, this.head).value;
    }

    private Node retrieve(int index, int actualIndex, Node actualNode) {
        if (actualNode == null) {
            return new Node();
        } else if (this.isActualNodeTheSearched(index, actualIndex)) {
            return actualNode;
        } else {
            actualNode = this.retrieve(index, actualIndex + 1, actualNode.node);
        }

        return actualNode;
    }

    public void change(int index, T value) {
        this.head = this.change(value, index, 0, this.head);
    }

    public Node change(T value, int index, int actualIndex, Node actualNode) {
        if (actualNode == null) {
            return new Node();
        } else if (this.isActualNodeTheSearched(index, actualIndex)) {
            actualNode.value = value;

            return actualNode;
        } else {
            actualNode.node = this.change(value, index, actualIndex + 1, actualNode.node);
        }

        return actualNode;
    }

    public void remove(int index) {
        this.head = this.remove(index, 0, this.head);
        this.size--;
    }

    private Node remove(int index, int actualIndex, Node actualNode) {
        if (actualNode == null) {
            return null;
        } else if (this.isActualNodeTheSearched(index, actualIndex)) {
            return actualNode.node;
        } else {
            actualNode.node = this.remove(index, actualIndex + 1, actualNode.node);
        }

        return actualNode;
    }

    private Boolean isActualNodeTheSearched(int index, int actualIndex) {
        return actualIndex == index;
    }
}