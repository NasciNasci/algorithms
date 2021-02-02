package DataStructures.Tree.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import DataStructures.Tree.BinaryTree;

public class BinaryTreeTest {
    @Test
    public void insertTest() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.insert(Integer.valueOf(0));
        binaryTree.insert(Integer.valueOf(-1));
        binaryTree.insert(Integer.valueOf(2));

        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        binaryTree.show();
        assertEquals("-1 0 2", out.toString().trim());
    }

    @Test
    public void findTest() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.insert(Integer.valueOf(0));
        binaryTree.insert(Integer.valueOf(-1));
        binaryTree.insert(Integer.valueOf(2));

        assert (binaryTree.find(0));
        assert (binaryTree.find(-1));
        assert (binaryTree.find(2));
        assert (!binaryTree.find(4));
    }
}