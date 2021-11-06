package com.github.fkleedorfer.training.trees.binary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTreeTests {

    @Test
    public void testSize(){
        BinaryTree<Integer> tree = prepareTree();
        Assertions.assertEquals(7,tree.size());
    }

    @Test
    public void testSize_emptyTree(){
        BinaryTree<Integer> tree = prepareEmptyTree();
        Assertions.assertEquals(0,tree.size());
    }

    @Test
    public void testMin(){
        BinaryTree<Integer> tree = prepareTree();
        Assertions.assertEquals(2, tree.min());
    }

    @Test
    public void testMin_emptyTree(){
        BinaryTree<Integer> tree = prepareEmptyTree();
        Assertions.assertEquals(null,tree.min());
    }

    @Test
    public void testMax(){
        BinaryTree<Integer> tree = prepareTree();
        Assertions.assertEquals(11, tree.max());
    }

    @Test
    public void testMax_emptyTree(){
        BinaryTree<Integer> tree = prepareEmptyTree();
        Assertions.assertEquals(null,tree.max());
    }

    @Test
    public void testContains(){
        BinaryTree<Integer> tree = prepareTree();
        Assertions.assertTrue(tree.contains(2));
        Assertions.assertTrue(tree.contains(10));
        Assertions.assertFalse(tree.contains(1));
        Assertions.assertFalse(tree.contains(20));
    }

    @Test
    public void testContains_emptyTree(){
        BinaryTree<Integer> tree = prepareEmptyTree();
        Assertions.assertFalse(tree.contains(2));
        Assertions.assertFalse(tree.contains(10));
        Assertions.assertFalse(tree.contains(1));
        Assertions.assertFalse(tree.contains(20));
    }

    private BinaryTree<Integer> prepareTree() {
        BinaryTree<Integer> tree = new BinaryTree<Integer>();
        tree.add(5);
        tree.add(2);
        tree.add(10);
        tree.add(3);
        tree.add(8);
        tree.add(9);
        tree.add(11);
        return tree;
    }

    private BinaryTree<Integer> prepareEmptyTree() {
        return new BinaryTree<Integer>();
    }
}
