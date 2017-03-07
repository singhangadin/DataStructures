package com.github.angads25.model;

/**<p>
 * Created by Angad on 06-03-2017.
 * </p>
 */

public class DoubleEndedNode {
    private String data;
    public DoubleEndedNode left, right;

    public DoubleEndedNode() {
        data = null;
        left = null;
        right = null;
    }

    public DoubleEndedNode(String data) {
        this.data = data;
        left = null;
        right = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
