package com.github.fkleedorfer.training.trees.binary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTreeTests {
    @Test
    public void testAdd(){
        BinaryTree<Integer> tree = new BinaryTree<Integer>();
        tree.add(5);
        tree.add(2);
        tree.add(10);
        tree.add(3);
        tree.add(8);
        tree.add(9);
        tree.add(11);
        Assertions.assertEquals(7,tree.size());
        Assertions.assertEquals(2, tree.min());
        Assertions.assertEquals(11, tree.max());
        Assertions.assertTrue(tree.contains(2));
        Assertions.assertTrue(tree.contains(10));
        Assertions.assertFalse(tree.contains(1));
        Assertions.assertFalse(tree.contains(20));
    }
}
