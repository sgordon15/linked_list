package edu.ti.collections.list.linked;

import jdk.internal.util.xml.impl.Input;

public class LinkedList {
    private java.lang.Object Object;

    private class Node {
        Object payload;
        Node next = null;

        public Node(Object payload) {
            this.payload = payload;
        }

        public Object getPayload() {
            return payload;
        }

        public void setPayload(Object payload) {
            this.payload = payload;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node head = null;

    public LinkedList() {
        // nothing
    }

    public LinkedList(Object payload) {
        head = new Node(payload);
    }

    public boolean isEmpty() {
        return (head == null);
    }

    //TODO -- implement private helper method end that returns last Node in list
    private Node endNode() {
        Node endNode = head;
        while (endNode.getNext() != null) {
            endNode = endNode.getNext();
        }
        return endNode;

    }

    //TODO -- implement size to return number of Nodes in list
    public int size() {
        int size = 0;
        Node currentNode = head;
        while (currentNode.getNext() != null) {
            size++;
            currentNode = currentNode.getNext();
        }
        return size;
    }

    //TODO -- implement insert, which inserts Node for object as new head of list
    public void insert(Object object) {
        Node newNode = new Node(object);
        newNode.setNext(head);
        head = newNode;
        //code needed here
    }

    //TODO -- implement append, that appends Node to end of list
    public void append(Object object) {
        Node new_node = new Node(object);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (isEmpty()) {
            head = new_node;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

    }

    //TODO -- implement get to retrieve the n-th object in the list,
    //        return null if n > (size() - 1)
    public Object get(int n) {
        if (n > size() - 1) {
            return null;
        } else {
            return Object;
        }

    }

    //TODO -- implement remove to remove n-th element of list,
    //        return Object if n < size(), null otherwise
    public Object remove(int n) {
        Node currentNode = head, prev = null;
        if (n == 0 && currentNode != null) {
            head = currentNode.next;
            System.out.println(n + " position element deleted");


            return Object;
        }

        int counter = 0;

        while (currentNode != null) {

            if (counter == n) {

                prev.next = currentNode.next;


                System.out.println(n + " position element deleted");
                return Object;
            } else {

                prev = currentNode;
                currentNode = currentNode.next;
                counter++;
            }
        }


        if (currentNode == null) {

            System.out.println(n + " position element not found");
        }


        return Object;
    }


    //TODO -- implement remove to remove given object from list,
    //        return Object if object is in the list, null otherwise
    public Object remove(Object object) {
        Node currentNode = head, prev = null;

        if (currentNode != null && currentNode == object) {
            head = currentNode.next;

            // Display the message
            System.out.println(object + " found and deleted");
            return object;
        }
        prev = currentNode;
        currentNode = currentNode.next;
        if (currentNode != null) {

            prev.next = currentNode.next;
            System.out.println(object + " found and deleted");
        }
        if (currentNode == null) {
            System.out.println(object + " not found");
        }
        return object;
    }
}



