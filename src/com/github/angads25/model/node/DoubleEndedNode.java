package com.github.angads25.model.node;

/**<p>
 * Created by Angad on 06-03-2017.
 * </p>
 */

public class DoubleEndedNode<Data> {
    private Data data;
    public DoubleEndedNode<Data> left, right;

    public DoubleEndedNode() {
        data = null;
        left = null;
        right = null;
    }

    public DoubleEndedNode(Data data) {
        this.data = data;
        left = null;
        right = null;
    }

    public Data getData() {
        return data;
    }

    public void setData(String Data) {
        this.data = data;
    }
}
