package com.netcracker.edu.java.tasks;

import java.util.Iterator;

public class TreeNodeImpl implements TreeNode {
    @Override
    public TreeNode getParent() {
        return null;
    }

    @Override
    public void setParent(TreeNode parent) {

    }

    @Override
    public TreeNode getRoot() {
        return null;
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public int getChildCount() {
        return 0;
    }

    @Override
    public Iterator<TreeNode> getChildrenIterator() {
        return null;
    }

    @Override
    public void addChild(TreeNode child) {

    }

    @Override
    public boolean removeChild(TreeNode child) {
        return false;
    }

    @Override
    public boolean isExpanded() {
        return false;
    }

    @Override
    public void setExpanded(boolean expanded) {

    }

    @Override
    public Object getData() {
        return null;
    }

    @Override
    public void setData(Object data) {

    }

    @Override
    public String getTreePath() {
        return null;
    }

    @Override
    public TreeNode findParent(Object data) {
        return null;
    }

    @Override
    public TreeNode findChild(Object data) {
        return null;
    }
}
