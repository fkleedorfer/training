package com.github.fkleedorfer.training.trees.binary;

import java.util.stream.Stream;

public class BinaryTree<T extends Comparable<T>> {
    Node<T> root;

    public BinaryTree(){
        this.root = null;
    }

    public void add(T item){
        if (this.root == null){
            this.root = new Node<T>(item);
            return;
        }
        insert(item, root);
    }

    private void insert(T item, Node<T> currentNode) {
        int comparison = item.compareTo(currentNode.value);
        if ( comparison == 0 ){
            //nothing to do, value is already in tree.
            return;
        }
        if (comparison > 0) {
            if (currentNode.right != null){
                insert (item, currentNode.right);
            } else {
                currentNode.right = new Node(item, null, null);
            }
        } else {
            if (currentNode.left != null){
                insert (item, currentNode.left);
            } else {
                currentNode.left = new Node(item, null, null);
            }
        }
    }

    public int size(){
        //TODO implement
        throw new UnsupportedOperationException("TODO implement!");
    }

    public T min(){
        //TODO implement
        throw new UnsupportedOperationException("TODO implement!");
    }

    public T max(){
        //Todo implement
        throw new UnsupportedOperationException("TODO implement!");
    }

    public boolean contains(T item){
        //Todo implement
        throw new UnsupportedOperationException("TODO implement!");
    }

    public String toString(){
        if (root == null) {
            return "BinaryTree(empty)";
        }

        StringBuilder b = new StringBuilder();
        b.append("BinaryTree:\n");
        print(root, 1, b);
        return b.toString();
    }

    private void print(Node<T> node, int level, StringBuilder builder) {
        if (node.left != null) {
            print(node.left, level + 1, builder);
        }
        for (int i = 0; i < level - 1 ; i++){
            builder.append(" ");
        }
        builder
                        .append("+-")
                        .append(node.value)
                        .append("\n");
        if (node.right != null){
            print(node.right, level + 1 , builder);
        }
    }
}
