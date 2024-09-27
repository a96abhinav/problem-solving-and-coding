package com.java.dsa.datastructures.Queue;

public class QueueUsingLinkedList {
    Node front;
    Node rear;
    int size;

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void enqueue(int data){
        Node newNode = new Node(data);
        if(front == null){
            front = newNode;
            rear = newNode;
            return;
        }
        Node currentNode = front;
        while(currentNode.next!=null){
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
        rear = newNode;
    }

    public int dequeue(){
        if(front == null){
            return -1;
        }
        else if(front == rear){
            int top = front.data;
            front = rear = null;
            return top;
        }else{
            int top = front.data;
            front = front.next;
            return top;
        }
    }

    public static void main(String[] args) {

        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(100);
        queue.enqueue(200);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
