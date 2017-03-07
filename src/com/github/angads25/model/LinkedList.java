package com.github.angads25.model;

/**<p>
 * Created by Angad on 06-03-2017.
 * </p>
 */

public abstract class LinkedList<T> {
    protected T start;
    protected int size;

    public abstract void insertionAtBeginning(String data);

    public abstract int insertionAtPosition(int position, String data);

    public abstract void insertionAtEnd(String data);

    public abstract String deletionFromBeginning();

    public abstract String deletionFromPosition(int position);

    public abstract String deletionFromEnd();

    @Override
    public abstract String toString();

    public int size() {
        return size;
    }
}
