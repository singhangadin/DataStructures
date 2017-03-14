package com.github.angads25.model.node;

/**<p>
 * Created by Angad on 06-03-2017.
 * </p>
 */
public class SingleEndedNode<Data> {
    private Data data;
    public SingleEndedNode<Data> next;

    public SingleEndedNode() {
        data = null;
        next = null;
    }

    public SingleEndedNode(Data data) {
        this.data = data;
        next = null;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
