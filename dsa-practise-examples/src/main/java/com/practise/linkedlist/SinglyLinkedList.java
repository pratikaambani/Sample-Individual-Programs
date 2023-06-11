package com.practise.linkedlist;

//001
public class SinglyLinkedList<Integer> {

    static SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    private Node<Integer> head;
    private Node<Integer> tail;

    public static void main(String[] args) {
        singlyLinkedList.addNode(4);
        singlyLinkedList.addNode(4);
        singlyLinkedList.addNode(1);
        singlyLinkedList.addNode(2);
        singlyLinkedList.addNode(8);
        singlyLinkedList.addNode(7);
        singlyLinkedList.addNode(7);
        singlyLinkedList.addNode(8);

        System.out.println("Reversing a linkedlist");
        singlyLinkedList.reverseLinkedList();

        System.out.println("Inserting value at beginning");
        singlyLinkedList.insertAtBeginning(5);
        singlyLinkedList.insertAtBeginning(15);
        singlyLinkedList.insertAtBeginning(25);

        System.out.println("Length of LinkedList");
        System.out.println("Length: " + singlyLinkedList.length());

        System.out.println("inserting values in mid of LinkedList");
        singlyLinkedList.insertAfter(singlyLinkedList.head.next, 23);
        singlyLinkedList.insertAfter(singlyLinkedList.head.next, 33);
        singlyLinkedList.insertAfter(singlyLinkedList.head.next, 43);

        System.out.println("Inserting value at last");
        singlyLinkedList.insertAtLast(7);
        singlyLinkedList.insertAtLast(87);
        singlyLinkedList.insertAtLast(87);

        System.out.println("Displaying values in LinkedList");
        singlyLinkedList.displayFields(singlyLinkedList);

        //removes 1st occurance of 5
        System.out.println("Removing element from the LinkedLIst");
        singlyLinkedList.removeElement(5);
        singlyLinkedList.removeElement(23);

        System.out.println("Displaying values in LinkedList");
        singlyLinkedList.displayFields(singlyLinkedList);
    }

    private void reverseLinkedList() {
        Node<Integer> previous = null;
        Node<Integer> current, next;
        current = head;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
        while (head != null) {
            System.out.print(head.data + " | ");
            head = head.next;
        }
        System.out.println();
    }

    private int length() {
        Node<Integer> temp = this.head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    private void removeElement(Integer value) {

        Node<Integer> temp = head;
        Node<Integer> previous = null;

        if (value == temp.data) {
            head = head.next;
        }

        while (head.data != value) {
            previous = temp;
            temp = temp.next;
        }

        if (previous != null) {
            return;
        }

        previous.next = temp.next;
    }

    private void insertAfter(Node<Integer> prevNode, int newData) {
        Node<Integer> newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;

    }

    private void insertAtLast(int newData) {
        Node<Integer> newNode = new Node(newData);

        tail.next = newNode;
        newNode.next = null;
        tail = newNode;
    }

    private void insertAtBeginning(int newData) {
        Node<Integer> newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    private void displayFields(SinglyLinkedList list) {
        while (list.head != null) {
            System.out.print(list.head.data + "  ");
            list.head = list.head.next;
        }
        System.out.println();
    }

    private void addNode(int data) {
        Node<Integer> newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    class Node<Integer> {

        Integer data;
        Node<Integer> next;

        public Node(Integer data) {
            this.data = data;
            this.next = null;
        }
    }

}


