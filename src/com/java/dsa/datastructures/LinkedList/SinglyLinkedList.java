package com.java.dsa.datastructures.LinkedList;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {

    Node head;
    int size;

    public void size(){
        System.out.println("List size - "+this.size);
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            size++;
            return;
        }
        Node lastNode = head;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
        size++;
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void printList(){
        Node currentNode = head;
        if(currentNode == null){
            System.out.println("The List is empty");
            return;
        }
        while(currentNode!=null){
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void delete(int data){
        Node currentNode = head;
        if(currentNode == null){
            System.out.println("The List is empty");
            return;
        }
        if(currentNode.data == data){
            head = head.next;
            size--;
            System.out.println(data +" is deleted from List");
            return;
        }
        Node nextNode = head.next;
        while(nextNode!=null){
            if(nextNode.data == data){
                if(nextNode.next==null){
                    currentNode.next = null;
                }else{
                    currentNode.next = nextNode.next;
                }
                size--;
                System.out.println(data +" is deleted from List");
                return;
            }
            currentNode = currentNode.next;
            nextNode = nextNode.next;
        }

    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.size();

        linkedList.add(23);
        linkedList.add(24);
        linkedList.add(25);
        linkedList.addFirst(26);
        linkedList.addFirst(27);
        linkedList.addFirst(28);

        linkedList.size();
        linkedList.printList();

        linkedList.delete(28);
        linkedList.delete(25);
        linkedList.delete(23);

        linkedList.size();
        linkedList.printList();
    }
}
