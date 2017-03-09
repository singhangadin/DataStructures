package com.github.angads25.model;

/**<p>
 * Created by Angad on 06-03-2017.
 * </p>
 */
public class SingleEndedNode<T> {
    private T data;
    public SingleEndedNode<T> next;

    public SingleEndedNode() {
        data = null;
        next = null;
    }

    public SingleEndedNode(T data) {
        this.data = data;
        next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
