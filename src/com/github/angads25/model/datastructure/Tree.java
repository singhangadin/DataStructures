package com.github.angads25.model.datastructure;

import com.github.angads25.model.node.DoubleEndedNode;

/**<p>
 * Created by Angad on 14-03-2017.
 * </p>
 */
public abstract class Tree<Data> {
    protected DoubleEndedNode<Data> root;

    public abstract void insertion(Data D);
}
