package dataStructures.Stack;

import dataStructures.List.CustomList;

/**
 * Stack created using the Stack structure algorithm as base and the CustomList.
 * In a Stack, the push operation is always applied at the end of the structure,
 * such as the pop operation.
 */
public class Stack<T> extends CustomList<T> {
    public void push(T value) {
        this.insert(value);
    }

    public void pop() {
        this.remove(this.size - 1);
    }

    public T retrieve(int index) {
        return super.retrieve(index);
    }
}
