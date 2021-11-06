package com.github.fkleedorfer.training.trees.binary;

public class Node<T> {
    Node left;
    Node right;
    T value;



    public Node(T value, Node left, Node right) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public Node(T value){
        this(value, null, null);
    }

    public Node() {
        this(null, null, null);
    }

}
