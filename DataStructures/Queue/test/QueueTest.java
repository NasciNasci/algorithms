package DataStructures.Queue.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import DataStructures.Queue.Queue;

public class QueueTest {
    @Test
    public void enqueueTest() {
        Queue<String> queue = new Queue<>();
        queue.enqueue("Primeiro");
        queue.enqueue("Segundo");

        assertEquals("Primeiro", queue.retrieve(0));
        assertEquals("Segundo", queue.retrieve(1));
    }

    @Test
    public void dequeueTest() {
        Queue<String> queue = new Queue<>();
        queue.enqueue("Primeiro");
        queue.enqueue("Segundo");

        queue.dequeue();
        assertEquals("Segundo", queue.retrieve(0));

        queue.dequeue();
        assertEquals(null, queue.retrieve(1));
    }

    @Test
    public void retrieveTest() {
        Queue<String> queue = new Queue<>();
        queue.enqueue("Primeiro");
        queue.enqueue("Segundo");

        assertEquals("Primeiro", queue.retrieve(0));
        assertEquals("Segundo", queue.retrieve(1));
    }
}
