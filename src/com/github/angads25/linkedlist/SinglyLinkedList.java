package com.github.angads25.linkedlist;

import com.github.angads25.model.LinkedList;
import com.github.angads25.model.SingleEndedNode;

/**<p>
 * Created by Angad on 06-03-2017.
 * </p>
 */

public class SinglyLinkedList<T> extends LinkedList<SingleEndedNode<T>, T> {
    private SingleEndedNode<T> new_node;

    public SinglyLinkedList() {
        start = null;
        size = 0;
    }

    private SingleEndedNode<T> getStart() {
        return start;
    }

    @Override
    public void insertionAtBeginning(T data) {
        new_node = new SingleEndedNode<>(data);
        if(start == null) {
            start = new_node;
        }
        else {
            new_node.next = start;
            start = new_node;
        }
        size++;
    }

    //Positions are zero indexed.
    @Override
    public int insertionAtPosition(int position, T data) {
        if(position<size) {
            if(position==0) {
                insertionAtBeginning(data);
            }
            else {
                int i = 0;
                new_node = new SingleEndedNode<>(data);
                SingleEndedNode<T> temp = start;
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
    public void insertionAtEnd(T data) {
        new_node = new SingleEndedNode<>(data);
        if(start == null) {
            insertionAtBeginning(data);
        }
        else {
            SingleEndedNode<T> temp_node = start;
            while (temp_node.next != null) {
                temp_node = temp_node.next;
            }
            temp_node.next = new_node;
            size++;
        }
    }

    @Override
    public T deletionFromBeginning() {
        if(start==null) {
            return null;
        }
        else {
            SingleEndedNode<T> temp = start;
            start = start.next;
            size--;
            return temp.getData();

        }
    }

    @Override
    public T deletionFromPosition(int position) {
        T data = null;
        if(position<size()) {
            if (position == 0) {
                data = deletionFromBeginning();
            }
            else {
                int i = 0;
                SingleEndedNode<T> temp_node = start;
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
    public T deletionFromEnd() {
        if(start==null) {
            return null;
        }
        else {
            SingleEndedNode<T> temp = start;
            if(temp.next==null) {
                start = null;
                return temp.getData();

            }
            while (temp.next.next!=null) {
                temp = temp.next;
            }
            T data = temp.next.getData();
            temp.next = null;
            size--;
            return data;
        }
    }

    @Override
    public String toString() {
        size = 0;
        StringBuilder builder = new StringBuilder();
        SingleEndedNode<T> temp = start;
        while (temp!=null) {
            builder.append(temp.getData().toString()).append("->");
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

    //Using another list
    public void reverseA() {
        SinglyLinkedList<T> new_list = new SinglyLinkedList<>();
        while(start!=null) {
            new_list.insertionAtEnd((deletionFromEnd()));
        }
        this.start = new_list.start;
    }

    //Using next and previous references
    public void reverseB() {
        SinglyLinkedList<T> new_list = new SinglyLinkedList<>();
        while(start!=null) {
            new_list.insertionAtEnd((deletionFromEnd()));
        }
        this.start = new_list.start;
    }

    //Using recursion
    public void reverseC() {
        SinglyLinkedList<T> new_list = new SinglyLinkedList<>();
        while(start!=null) {
            new_list.insertionAtEnd((deletionFromEnd()));
        }
        this.start = new_list.start;
    }

    public int getSize() {
        new_node = start;
        size = getSizeRecursively();
        return size;
    }

    private int getSizeRecursively() {
        if(new_node.next==null) {
            return 1;
        }
        else {
            new_node = new_node.next;
            return getSizeRecursively() + 1;
        }
    }

    public void mergeSortList(SinglyLinkedList<T> list) {
        SingleEndedNode<T> start1 = list.getStart();
        SingleEndedNode<T> temp = start;
        int i = 0;
        SinglyLinkedList<T> new_list = new SinglyLinkedList<>();
        while (temp != null || start1 != null) {
            if(temp == null) {
                while (start1 != null) {
                    new_list.insertionAtPosition(i,start1.getData());
                    i++;
                    start1 = start1.next;
                }
            }
            else if(start1 == null) {
                while (temp != null) {
                    new_list.insertionAtPosition(i,temp.getData());
                    i++;
                    temp = temp.next;
                }
            }
            else {
                if(Integer.valueOf(temp.getData().toString()) < Integer.valueOf(start1.getData().toString())) {
                    new_list.insertionAtPosition(i,temp.getData());
                    i++;
                    temp = temp.next;
                }
                else {
                    new_list.insertionAtPosition(i,start1.getData());
                    i++;
                    start1 = start1.next;
                }
            }
        }
        this.start = new_list.start;
    }

    public void mergeSortList() {
        //TODO Do This Without Help!
    }

    public void addNumbers(SinglyLinkedList list) {
        //TODO Do This Without Help!
    }
}
