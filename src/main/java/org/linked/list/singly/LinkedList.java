package org.linked.list.singly;

public class LinkedList<T> {

    private Node head;
    private Node tail;
    private long length = 0;

    public LinkedList(T value) {
        this.head = new Node(value);
        this.tail = head;
        this.length = 1;
    }

    public void append(T value) {
        Node n = new Node(value);
        tail.next = n;
        tail = n;
        length++;
    }

    public void prepend(T value) {
        Node n = new Node(value);
        n.next = head;

        head = n;

        length++;
    }

    public void insert(int index, T value) {
        Node currentNode = this.head;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }
        Node newNode = new Node(value);
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        this.length++;
    }

    private class Node {
        private T value;
        private Node next;

        public Node(T content) {
            this.value = content;
        }

        @Override
        public String toString() {
            return " value : " + value;
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        Node h = head;
        while (h != null) {
            s.append(h.toString());
            h = h.next;
        }
        return s.toString();
    }

}

