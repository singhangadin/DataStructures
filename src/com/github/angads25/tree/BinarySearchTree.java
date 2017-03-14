package com.github.angads25.tree;

import com.github.angads25.model.datastructure.Tree;
import com.github.angads25.model.node.DoubleEndedNode;

/**<p>
 * Created by Angad on 14-03-2017.
 * </p>
 */

public class BinarySearchTree<Data> extends Tree<Data> {

    public BinarySearchTree() {
        root = null;
    }

    @Override
    public void insertion(Data D) {
        if(root == null) {
            root = new DoubleEndedNode<>(D);
        }
        else {
            DoubleEndedNode<Data> temp = root, parent = null;
            while(temp != null) {
                parent = temp;
                if(Integer.valueOf(D.toString())<Integer.valueOf(temp.getData().toString())) {
                    temp = temp.left;
                }
                else {
                    temp = temp.right;
                }
            }
            DoubleEndedNode<Data> new_node = new DoubleEndedNode<>(D);
            if(Integer.valueOf(D.toString())<Integer.valueOf(parent.getData().toString())) {
                parent.left = new_node;
            }
            else {
                parent.right = new_node;
            }
        }
    }

    public void traversal(int type) {
        switch(type) {
            case 0: preOrderTraversal(root);
                    break;

            case 1: inOrderTraversal(root);
                    break;

            case 2: postOrderTraversal(root);
        }
    }

    private void preOrderTraversal(DoubleEndedNode<Data> node) {
        if(node == null) {
            return;
        }

        System.out.print(node.getData().toString()+"->");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    private void inOrderTraversal(DoubleEndedNode<Data> node) {
        if(node == null) {
            return;
        }

        inOrderTraversal(node.left);
        System.out.print(node.getData().toString()+"->");
        inOrderTraversal(node.right);
    }

    private void postOrderTraversal(DoubleEndedNode<Data> node) {
        if(node == null) {
            return;
        }

        inOrderTraversal(node.left);
        inOrderTraversal(node.right);
        System.out.print(node.getData().toString()+"->");
    }
}