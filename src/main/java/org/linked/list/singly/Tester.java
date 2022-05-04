package org.linked.list.singly;

public class Tester {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>(1);
        l.append(2);
        l.prepend(0);
        System.out.println(l);

    }
}
