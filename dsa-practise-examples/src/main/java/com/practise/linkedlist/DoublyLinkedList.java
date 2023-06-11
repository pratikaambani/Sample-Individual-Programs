package com.practise.linkedlist;

//002
public class DoublyLinkedList<Integer> {

    private Node<Integer> head;
    private Node<Integer> tail;

    public static void main(String[] args) {
        DoublyLinkedList singlyLinkedList = new DoublyLinkedList();
        singlyLinkedList.addNode(4);
        singlyLinkedList.addNode(4);
        singlyLinkedList.addNode(1);
        singlyLinkedList.addNode(2);
        singlyLinkedList.addNode(8);
        singlyLinkedList.addNode(7);
        singlyLinkedList.addNode(7);
        singlyLinkedList.addNode(8);

        singlyLinkedList.displayFieldsAscending(singlyLinkedList);
        System.out.println();
        singlyLinkedList.displayFieldsDescending(singlyLinkedList);

//        TODO: Insertion at beginning
//        TODO: Insertion in mid of DoublyLinkedList
//        TODO: Insertion at end
//        TODO: Deleting a value from DoublyLinkedList
//        TODO: Deleting a value from DoublyLinkedList
//        TODO: Reversing a DoublyLinkedList

//        TODO: New CircularLinkedList
//        TODO: Insertion at beginning
//        TODO: Insertion in mid of CircularLinkedList
//        TODO: Insertion at end
//        TODO: Deleting a value from CircularLinkedList
//        TODO: Deleting a value from CircularLinkedList
//        TODO: Reversing a CircularLinkedList


//        TODO: New DoublyCircularLinkedList
//        TODO: Insertion at beginning
//        TODO: Insertion in mid of DoublyCircularLinkedList
//        TODO: Insertion at end
//        TODO: Deleting a value from DoublyCircularLinkedList
//        TODO: Deleting a value from DoublyCircularLinkedList
//        TODO: Reversing a DoublyCircularLinkedList

    }

    private void displayFieldsAscending(DoublyLinkedList list) {
        while (list.head != null) {
            System.out.print(list.head.data + " ");
            list.head = list.head.next;
        }
    }

    private void displayFieldsDescending(DoublyLinkedList list) {
        while (list.tail != null) {
            System.out.print(list.tail.data + " ");
            list.tail = list.tail.previous;
        }
    }

    private void addNode(int data) {
        Node<Integer> newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.previous = null;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    class Node<Integer> {

        Integer data;
        Node<Integer> next;
        Node<Integer> previous;

        public Node(Integer data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }


}
