package dataStructures.Queue;

import dataStructures.List.CustomList;

/**
 * Queue created using as base the Queue structure algorithm and the CustomList.
 * The enqueue operation is always applied at the end of the structure and the
 * dequeue operation is always applied at the begginning of the structure.
 */
public class Queue<T> extends CustomList<T> {
    public void enqueue(T value) {
        super.insert(value);
    }

    public T retrieve(int index) {
        return super.retrieve(index);
    }

    public void dequeue() {
        super.remove(0);
    }
}
