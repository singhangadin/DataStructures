package com.github.angads25.model.datastructure;

/**<p>
 * Created by Angad on 06-03-2017.
 * </p>
 */

public abstract class LinkedList<Node, Data> {
    protected Node start;
    protected int size;

    public abstract void insertionAtBeginning(Data data);

    public abstract int insertionAtPosition(int position, Data data);

    public abstract void insertionAtEnd(Data data);

    public abstract Data deletionFromBeginning();

    public abstract Data deletionFromPosition(int position);

    public abstract Data deletionFromEnd();

    @Override
    public abstract String toString();

    public int size() {
        return size;
    }
}
