package com.github.angads25.model;

/**<p>
 * Created by Angad on 06-03-2017.
 * </p>
 */
public class SingleEndedNode {
    private String data;
    public SingleEndedNode next;

    public SingleEndedNode() {
        data = null;
        next = null;
    }

    public SingleEndedNode(String data) {
        this.data = data;
        next = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
