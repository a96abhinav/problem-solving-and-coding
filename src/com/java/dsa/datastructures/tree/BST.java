package com.java.dsa.datastructures.tree;

public class BST {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(root.data<value){
            root.right = insert(root.right,value);
        }else{
            root.left = insert(root.left,value);
        }
        return root;
    }

    public static void inOrder(Node root){
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }

    public static boolean search(Node root, int value){
        if(root == null){
            return false;
        }else if(root.data == value){
            return true;
        }else if(root.data<value){
            return search(root.right,value);
        }else{
            return search(root.left,value);
        }
    }

    public static Node delete(Node root, int value){
        if(root.data>value){
            root.left = delete(root.left,value);
        }else if(root.data<value){
            root.right = delete(root.right,value);
        }else{
            if(root.left == null && root.right == null){
                return null;
            }else if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
            Node IS = inOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right,IS.data);
        }
        return root;
    }

    public static Node inOrderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root,int X, int Y){
        if(root==null){
            return;
        }
        if(root.data >=X && root.data<=Y){
            printInRange(root.left,X,Y);
            System.out.print(root.data+" ");
            printInRange(root.right,X,Y);
        }else if(root.data>=Y){
            printInRange(root.left,X,Y);
        }else{
            printInRange(root.right,X,Y);
        }

    }
    public static void main(String[] args) {
        int[] values = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i = 0;i<values.length;i++){
            root = insert(root,values[i]);
        }

        System.out.println();
        inOrder(root);
        delete(root,5);
        System.out.println();
        inOrder(root);

        System.out.println();
        printInRange(root,3,10);

        if(search(root,6)){
            System.out.println("\nFound");
        }else{
            System.out.println("\nNot Found");
        }
    }
}
