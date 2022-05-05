package org.linked.list.singly;

public class Tester {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>(2);
        l.prepend(0);
        l.insert(1, 1);
        l.append(3);

        l.insert(3, 99);
        l.insert(5, 44);
        System.out.println(l);

    }
}
