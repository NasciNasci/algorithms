package dataStructures.List.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import dataStructures.List.CustomList;

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
        assertEquals(null, customList.retrieve(21));
    }

    @Test
    public void changeTest() {
        CustomList<Float> customList = new CustomList<>();
        customList.add(Float.valueOf(0.12f));
        customList.add(Float.valueOf(12.32f));
        customList.add(Float.valueOf(321.75f));
        customList.add(Float.valueOf(1.2345f));

        customList.change(0, Float.valueOf(0.45f));
        customList.change(3, Float.valueOf(255.0f));
        customList.change(10, Float.valueOf(255.0f));

        assertEquals(Float.valueOf(0.45f), customList.retrieve(0));
        assertEquals(Float.valueOf(255.0f), customList.retrieve(3));
        assertEquals(null, customList.retrieve(10));
    }

    @Test
    public void removeTest() {
        CustomList<Float> customList = new CustomList<>();
        customList.add(Float.valueOf(0.12f));
        customList.add(Float.valueOf(12.32f));
        customList.add(Float.valueOf(321.75f));
        customList.add(Float.valueOf(1.2345f));

        customList.remove(0);
        customList.remove(2);

        assertEquals(Float.valueOf(12.32f), customList.retrieve(0));
        assertEquals(Float.valueOf(321.75f), customList.retrieve(1));
        assertEquals(null, customList.retrieve(2));
    }
}