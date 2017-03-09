package com.github.angads25.model;

/**<p>
 * Created by Angad on 06-03-2017.
 * </p>
 */

public abstract class LinkedList<T, D> {
    protected T start;
    protected int size;

    public abstract void insertionAtBeginning(D data);

    public abstract int insertionAtPosition(int position, D data);

    public abstract void insertionAtEnd(D data);

    public abstract D deletionFromBeginning();

    public abstract D deletionFromPosition(int position);

    public abstract D deletionFromEnd();

    @Override
    public abstract String toString();

    public int size() {
        return size;
    }
}
