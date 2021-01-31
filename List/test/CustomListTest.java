package List.test;

import org.junit.Test;
import junit.framework.*;
import List.CustomList;

class CustomListTest extends TestCase {
    @Test
    void addTest() {
        CustomList<String> customList = new CustomList<>();
        customList.add("Primeiro");
        customList.add("Segundo");

    }

    @Test
    void retrieveTest() {
    }

    @Test
    void changeTest() {
    }

    @Test
    void removeTest() {
    }
}