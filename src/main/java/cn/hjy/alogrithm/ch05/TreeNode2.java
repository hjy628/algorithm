package cn.hjy.alogrithm.ch05;

import cn.hjy.alogrithm.ch02.Link;

/**
 * Created by hjy on 17-8-24.
 */
public class TreeNode2 {

    private String data;
    private int parent;
    private Link children;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

    public Link getChildren() {
        return children;
    }

    public void setChildren(Link children) {
        this.children = children;
    }
}
