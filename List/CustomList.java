package List;

/**
 * CustomList created using as base the List structure algorithm having a header
 * node as primary pointer to the other ones. The first value is maintained
 * empty to keep things easier while removing the elements.
 */
public class CustomList<T> {
    protected class Node {
        public Node node;
        public T value;

        public Node() {
            this.node = null;
            this.value = null;
        }
    }

    protected Node header;
    protected int size;

    public CustomList() {
        this.header = null;
        this.size = 0;
    }

    /**
     * Method responsible for adding new elements to the structure. It is composed by
     * three major steps:
     * 
     * 1) Consulting if header element is empty and filling the first node value; 
     * 2) Iterating over elements and stopping at the last one; 
     * 3) Instantiating the last node and defining its value.
     */
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
        this.size++;
    }

    /**
     * Method responsible for retrieving the added elements from the structure. It is
     * composed by three major steps:
     * 
     * 1) Consulting if header element is empty;
     * 2) Iterating over elements and stopping at the position passed; 
     * 3) Checking if the last element has or has not defined value and returning it.
     */
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

    /**
     * Method responsible for changing the value of a certain node in the
     * structure. It is composed by three major steps:
     * 
     * 1) Consulting if header element is empty;
     * 2) Iterating over elements and stopping at the position passed; 
     * 3) Checking if the last element is or is not defined and changing its value.
     */
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

    /**
     * Method responsible for removing a certain node from the
     * structure. It is composed by three major steps:
     * 
     * 1) Consulting if header element is empty;
     * 2) Iterating over elements and stopping at the position passed; 
     * 3) Checking if the last element is or is not defined and removing it.
     */
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
        this.size--;
    }
}