package com.example.homework.utils;

import java.util.Collection;

public class BasicLinkedList {
    Node head;

    public BasicLinkedList() {
        head = null;
    }

    public BasicLinkedList insert(Integer value) {
        Node newHead = new Node(value);
        newHead.setNext(head);
        head = newHead;
        return this;
    }

    public void print() {
        System.out.println();
        Node tmp = head;

        while(tmp != null) {
            System.out.print(tmp.getValue() +", ");
            tmp = tmp.getNext();
        }
    }

    public Integer size() {
        // do this
        return 0;
    }

    public BasicLinkedList insertAll(Integer... values) {
        // do this
        return this;
    }

    public BasicLinkedList insertAll(Collection<Integer> values) {
        // do this
        return this;
    }

    public BasicLinkedList clear() {
        // do this
        return this;
    }

    public BasicLinkedList delete(Integer value) {
        // do this
        return this;
    }

    public BasicLinkedList reverse() {
        // do this
        return this;
    }


    private class Node {
        private Integer value;
        private Node next;

        public Node(Integer value) {
            this.value = value;
            this.next = null;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
