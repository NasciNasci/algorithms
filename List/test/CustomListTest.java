package List.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import List.CustomList;

public class CustomListTest {
    @Test
    public void addTest() {
        CustomList<String> customList = new CustomList<>();
        customList.add("Primeiro");
        customList.add("Segundo");

        assertEquals("Primeiro", customList.retrieve(0));
        assertEquals("Segundo", customList.retrieve(1));
    }

    @Test
    public void retrieveTest() {
        CustomList<Integer> customList = new CustomList<>();
        customList.add(Integer.valueOf(0));
        customList.add(Integer.valueOf(1));

        assertEquals(Integer.valueOf(0), customList.retrieve(0));
        assertEquals(Integer.valueOf(1), customList.retrieve(1));
    }

    @Test
    public void changeTest() {
    }

    @Test
    public void removeTest() {
    }
}