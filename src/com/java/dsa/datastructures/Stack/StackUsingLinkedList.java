package com.java.dsa.datastructures.Stack;

public class StackUsingLinkedList {

    Node head;

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public int pop(){

        if(isEmpty()){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }
    public static void main(String[] args) {

        StackUsingLinkedList stack = new StackUsingLinkedList();
        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
