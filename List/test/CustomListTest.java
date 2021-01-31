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

        assertEquals(0, 0);
    }

    @Test
    public void retrieveTest() {
    }

    @Test
    public void changeTest() {
    }

    @Test
    public void removeTest() {
    }
}