package com.github.angads25.utils;

import com.github.angads25.model.node.SingleEndedNode;

/**<p>
 * Created by Angad on 14-03-2017.
 * </p>
 */
public class Queue<Data> {
    private int size;
    private SingleEndedNode<Data> start, rear;

    public Queue() {
        size = 0;
        start = null;
        rear = null;
    }

    public void enQueue(Data D) {
        SingleEndedNode<Data> new_node = new SingleEndedNode<>(D);
        if(start==null) {
            start = new_node;
            rear = new_node;
        }
        else {
            rear.next = new_node;
            rear = new_node;
        }
        size++;
    }

    public Data deQueue() {
        if(start==null) {
            return null;
        }
        else {
            SingleEndedNode<Data> temp;
            temp = start;
            start = start.next;
            return temp.getData();
        }
    }

    public void traverse(int type) {
        switch(type) {
            case 0: traverseRecursive(start);
                    break;

            case 1:
                    break;
        }
    }

    private void traverseRecursive(SingleEndedNode<Data> start) {
        if(start!=null) {
            System.out.print(start.getData().toString()+"->");
            traverseRecursive(start.next);
        }
    }
}
