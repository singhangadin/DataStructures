package com.github.angads25.model;

/**<p>
 * Created by Angad on 06-03-2017.
 * </p>
 */

public abstract class LinkedList<T> {
    public T node;
    public int size;

    public abstract void insertionAtBeginning(String data);

    public abstract void insertionAtPosition(int position, String data);

    public abstract void insertionAtEnd(String data);

    public abstract String deletionFromBeginning();

    public abstract String deletionFromPosition(int position);

    public abstract String deletionFromEnd();

    public abstract int traverse();
}
