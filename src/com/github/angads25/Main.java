package com.github.angads25;

import com.github.angads25.linkedlist.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        for(int i = 0 ; i < 10; i++ ) {
            list.insertionAtEnd(i);
        }
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
        for(int i = 10 ; i < 20; i++ ) {
            list1.insertionAtEnd(i);
        }
        list.mergeSortList(list1);
        System.out.println(list);
        list.reverseA();
        System.out.println(list);
    }
}
