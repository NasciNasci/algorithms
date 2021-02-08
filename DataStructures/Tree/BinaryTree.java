package dataStructures.Tree;

public class BinaryTree<T extends Comparable<T>> {
    private class Node {
        private Node leftNode;
        private Node rightNode;
        private T value;

        public Node() {
            this.leftNode = null;
            this.rightNode = null;
            this.value = null;
        }
    }

    private Node head;

    public void insert(T value) {
        this.head = this.insert(value, this.head);
    }

    private Node insert(T value, Node actualNode) {
        if (actualNode == null) {
            actualNode = new Node();
            actualNode.value = value;
        } else if (value.compareTo(actualNode.value) < 0) {
            actualNode.leftNode = this.insert(value, actualNode.leftNode);
        } else if (value.compareTo(actualNode.value) > 0) {
            actualNode.rightNode = this.insert(value, actualNode.rightNode);
        }

        return actualNode;
    }

    public boolean find(T value) {
        return this.find(value, this.head);
    }

    private boolean find(T value, Node actualNode) {
        if (actualNode == null) {
            return false;
        } else if (value.compareTo(actualNode.value) < 0) {
            return this.find(value, actualNode.leftNode);
        } else if (value.compareTo(actualNode.value) > 0) {
            return this.find(value, actualNode.rightNode);
        }

        return true;
    }

    public void show() {
        this.show(this.head);
    }

    private void show(Node actualNode) {
        if (actualNode != null) {
            this.show(actualNode.leftNode);
            System.out.print(actualNode.value + " ");
            this.show(actualNode.rightNode);
        }
    }
}
