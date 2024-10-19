package com.java.dsa.datastructures.tree;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BinaryTrees {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    //DFS Traversal
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    //DFS Traversal
    public static void inOrder(Node root){
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }

    //DFS Traversal
    public static void postOrder(Node root){
        if(root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data);
    }

    //BFS Traversal
    public static void levelOrderTraversal(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        while(!queue.isEmpty()){
            Node currentNode = queue.poll();
            if(currentNode==null){
                System.out.println();
                if(queue.isEmpty()){
                    break;
                }else{
                    queue.offer(null);
                }
            }else {
                System.out.print(currentNode.data);
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }
            }
        }
    }

    public static int  countOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftC = countOfNodes(root.left);
        int rightC = countOfNodes(root.right);
        return leftC+rightC+1;
    }

    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftS = sumOfNodes(root.left);
        int rightS = sumOfNodes(root.right);
        return leftS+rightS+root.data;
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        //
        int diam3 = height(root.left)+height(root.right)+1;
        return Math.max(diam3,Math.max(diam1,diam2));
        //OR
        //return height(root.left)+height(root.right)+1;
    }

    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht,int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root){
        if(root == null){
            return new TreeInfo(0,0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int height = Math.max(left.ht,right.ht)+1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht+right.ht+1;
        int diam = Math.max(diam3,Math.max(diam1,diam2));

        return new TreeInfo(height,diam);
    }

    public static boolean isSubTree(Node root,Node subRoot){
        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return isSubTree(root.left,subRoot)||isSubTree(root.right,subRoot);
    }

    public static boolean isIdentical(Node root, Node subRoot){
        if(root==null & subRoot == null){
            return true;
        }
        if(root==null || subRoot == null){
            return false;
        }
        if(root.data == subRoot.data){
            return isIdentical(root.left, subRoot.left)&&isIdentical(root.right,subRoot.right);
        }
        return false;
    }

    public static void main(String[] args) {

        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("\nPreOrder Traversal - ");
        preOrder(root);
        System.out.println("\nInOrder Traversal - ");
        inOrder(root);
        System.out.println("\nPostOrder Traversal - ");
        postOrder(root);
        System.out.println("\nLevelOrder Traversal - ");
        levelOrderTraversal(root);
        System.out.println("\nCount of Nodes - "+countOfNodes(root));
        System.out.println("\nSum of Nodes - "+sumOfNodes(root));
        System.out.println("\nHeight of Tree - "+height(root));
        System.out.println("\nDiameter of Tree((O)N2) - "+diameter(root));
        System.out.println("\nDiameter of Tree((O)N) - "+diameter2(root).diam);
        System.out.println("\nSubtree of Tree - "+isSubTree(root,root));
    }
}
