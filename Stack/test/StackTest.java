package Stack.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import Stack.Stack;

public class StackTest {
    @Test
    public void pushTest() {
        Stack<String> stack = new Stack<>();
        stack.push("Primeiro");
        stack.push("Segundo");

        assertEquals("Primeiro", stack.retrieve(0));
        assertEquals("Segundo", stack.retrieve(1));
    }

    @Test
    public void popTest() {
        Stack<String> stack = new Stack<>();
        stack.push("Primeiro");
        stack.push("Segundo");

        stack.pop();
        assertEquals("Primeiro", stack.retrieve(0));
        assertEquals(null, stack.retrieve(1));

        stack.pop();
        assertEquals(null, stack.retrieve(0));
    }
}
