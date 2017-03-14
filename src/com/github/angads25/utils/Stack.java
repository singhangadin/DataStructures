package com.github.angads25.utils;

import com.github.angads25.model.node.SingleEndedNode;

/**<p>
 * Created by Angad on 14-03-2017.
 * </p>
 */

public class Stack<Data> {
    private int size;
    private SingleEndedNode<Data> top;

    public Stack() {
        size = 0;
        top = null;
    }

    public void push(Data D) {
        SingleEndedNode<Data> new_node = new SingleEndedNode<>(D);
        if(top == null) {
            top = new_node;
        }
        else {
            new_node.next = top;
            top = new_node;
        }
        size++;
    }

    public Data pop() {
        if(top==null) {
            return null;
        }
        else {
            SingleEndedNode<Data> temp = top;
            top = top.next;
            size--;
            return temp.getData();
        }
    }

    public int getSize() {
        return size;
    }

    public void traverse(int i) {
        switch(i) {
            case 0: traverseRecursive(top);
                    break;
        }
    }

    private void traverseRecursive(SingleEndedNode<Data> top) {
        if(top!=null) {
            System.out.print(top.getData().toString()+"->");
            traverseRecursive(top.next);
        }
    }
}
