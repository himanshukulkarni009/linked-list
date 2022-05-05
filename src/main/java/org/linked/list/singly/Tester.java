package org.linked.list.singly;

public class Tester {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>(2);
        System.out.println(l);
        l.prepend(0);
        System.out.println(l);
        l.insert(1, 1);
        System.out.println(l);
        l.append(3);
        System.out.println(l);
        l.insert(3, 99);
        System.out.println(l);
        l.insert(5, 44);
        System.out.println(l);

        l.remove(0);
        System.out.println(l);

        l.remove(1);
        System.out.println(l);

        l.remove(2);
        System.out.println(l);
    }
}
