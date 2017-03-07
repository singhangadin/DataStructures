package com.github.angads25.linkedlist;

import com.github.angads25.model.LinkedList;
import com.github.angads25.model.SingleEndedNode;

/**<p>
 * Created by Angad on 06-03-2017.
 * </p>
 */

public class SinglyLinkedList extends LinkedList<SingleEndedNode> {

    public SinglyLinkedList() {
        start = null;
        size = 0;
    }

    @Override
    public void insertionAtBeginning(String data) {
        SingleEndedNode new_node = new SingleEndedNode(data);
        if(start == null) {
            start = new_node;
        }
        else {
            new_node.next = start;
            start = new_node;
        }
        size++;
    }

    @Override
    public int insertionAtPosition(int position, String data) {
        if(position<size) {
            if(position==0) {
                insertionAtBeginning(data);
            }
            else {
                int i = 0;
                SingleEndedNode new_node = new SingleEndedNode(data);
                SingleEndedNode temp = start;
                while (i != position-1) {
                    temp = temp.next;
                    i++;
                }
                new_node.next = temp.next;
                temp.next = new_node;
                size++;
            }
            return position;
        }
        else if(position == size) {
            insertionAtEnd(data);
            return position;
        }
        else {
            return -1;
        }
    }

    @Override
    public void insertionAtEnd(String data) {
        SingleEndedNode new_node = new SingleEndedNode(data);
        if(start == null) {
            insertionAtBeginning(data);
        }
        else {
            SingleEndedNode temp_node = start;
            while (temp_node.next != null) {
                temp_node = temp_node.next;
            }
            temp_node.next = new_node;
            size++;
        }
    }

    @Override
    public String deletionFromBeginning() {
        if(start==null) {
            return null;
        }
        else {
            SingleEndedNode temp = start;
            start = start.next;
            size--;
            return temp.getData();

        }
    }

    @Override
    public String deletionFromPosition(int position) {
        String data = null;
        if(position<size()) {
            if (position == 0) {
                data = deletionFromBeginning();
            }
            else {
                int i = 0;
                SingleEndedNode temp_node = start;
                while (i!=position-1) {
                    temp_node = temp_node.next;
                    i++;
                }
                data = temp_node.next.getData();
                temp_node.next = temp_node.next.next;
                size--;
            }
        }
        else if (position==size-1) {
            data = deletionFromEnd();
        }
        return data;
    }

    @Override
    public String deletionFromEnd() {
        if(start==null) {
            return null;
        }
        else {
            SingleEndedNode temp = start;
            while (temp.next.next!=null) {
                temp = temp.next;
            }
            String data = temp.next.getData();
            temp.next = null;
            size--;
            return data;
        }
    }

    @Override
    public String toString() {
        size = 0;
        StringBuilder builder = new StringBuilder();
        SingleEndedNode temp = start;
        while (temp!=null) {
            builder.append(temp.getData()).append("->");
            temp = temp.next;
            size++;
        }
        builder.append("null");
        return builder.toString();
    }

    public void rotate(int k) {
        //TODO Do This Without Help!
        //Rotate Counter-Clockwise
    }

    public void reverse() {
        //TODO Do This Without Help!
    }

    public int getSizeRecursively() {
        //TODO Do This Without Help!
        return -1;
    }

    public void mergeList(SinglyLinkedList list) {
        //TODO Do This Without Help!
    }

    public void mergeSortList(SinglyLinkedList list) {
        //TODO Do This Without Help!
    }

    public void addNumbers(SinglyLinkedList list) {
        //TODO Do This Without Help!
    }
}
