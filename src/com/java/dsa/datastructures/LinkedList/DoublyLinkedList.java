package com.java.dsa.datastructures.LinkedList;

public class DoublyLinkedList {

    Node head;
    Node tail;
    int size;

    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void size(){
        System.out.println("List size - "+this.size);
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        Node currentNode = head;
        while(currentNode.next!=null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        newNode.prev = currentNode;
        tail = newNode;
        size++;
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            size++;
            return;
        }

        head.prev=newNode;
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

    public void printReverseList(){
        Node tailNode = tail;
        if(tailNode == null){
            System.out.println("The List is empty");
            return;
        }
        while(tailNode!=null){
            System.out.print(tailNode.data+"->");
            tailNode = tailNode.prev;
        }
        System.out.println();
    }

    public void delete(int data){
        Node currentNode = head;
        boolean isDataPresent = false;
        if(currentNode == null){
            System.out.println("The List is empty");
            return;
        }
        if(currentNode.data == data && currentNode.next == null){
            isDataPresent = true;
            head = null;
            tail = null;
            size--;
            System.out.println(data +" is deleted from List");
            return;
        }
        if(currentNode.data == data){
            isDataPresent = true;
            head = head.next;
            head.prev = null;
            size--;
            System.out.println(data +" is deleted from List");
            return;
        }
        Node nextNode = head.next;
        while(nextNode!=null){
            if(nextNode.data == data){
                isDataPresent = true;
                if(nextNode.next==null){
                    nextNode.prev = null;
                    currentNode.next = null;
                    this.tail = currentNode;
                }else{
                    nextNode.prev = null;
                    nextNode.next.prev=currentNode;
                    currentNode.next = nextNode.next;
                }
                size--;
                System.out.println(data +" is deleted from List");
                return;
            }
            currentNode = currentNode.next;
            nextNode = nextNode.next;
        }
        if(!isDataPresent){
            System.out.println(data +" does not exist in list");
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.size();

        linkedList.add(23);
        linkedList.add(24);
        linkedList.add(25);
        linkedList.addFirst(26);
        linkedList.addFirst(27);
        linkedList.addFirst(28);

        linkedList.size();
        linkedList.printList();
        linkedList.printReverseList();

        linkedList.delete(28);
        linkedList.delete(25);
        linkedList.delete(23);
        linkedList.delete(26);
        linkedList.delete(26);
        linkedList.delete(25);
        linkedList.delete(23);
        linkedList.delete(24);
        linkedList.delete(27);

        linkedList.add(23);
        linkedList.add(24);
        linkedList.add(25);
        linkedList.addFirst(26);
        linkedList.addFirst(27);
        linkedList.addFirst(28);

        linkedList.size();
        linkedList.printList();
        linkedList.printReverseList();
    }
}
