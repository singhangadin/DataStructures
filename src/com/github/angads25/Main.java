package com.github.angads25;

import com.github.angads25.utils.Stack;

public class Main {

    public static void main(String[] args) {
//        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
//        for(int i = 0 ; i < 10; i++ ) {
//            list.insertionAtEnd(i);
//        }
//        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
//        for(int i = 10 ; i < 20; i++ ) {
//            list1.insertionAtEnd(i);
//        }
//        list.mergeSortList(list1);
//        System.out.println(list);
//        list.reverseA();
//        System.out.println(list);
//        list.rotate(3);
//        System.out.println(list);
//        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
//        tree.insertion(11);
//        tree.insertion(6);
//        tree.insertion(13);
//        tree.insertion(0);
//        tree.insertion(5);
//        tree.insertion(41);
//        tree.traversal(1);

        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < 10 ; i++) {
            stack.push(i);
            stack.traverse(0);
            System.out.println();
        }
        for(int i = 0; i < 10 ; i++) {
            stack.pop();
            stack.traverse(0);
            System.out.println();
        }
    }
}
