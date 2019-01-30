package com.yogurts.collection;

/* 节点类 */
public class YGNode {
    private YGNode previous;
    private Object obj;
    private YGNode next;

    public YGNode(Object obj) {
        this.obj = obj;
    }

    public YGNode(YGNode previous, Object obj, YGNode next) {
        this.previous = previous;
        this.obj = obj;
        this.next = next;
    }

    public YGNode getPrevious() {
        return previous;
    }

    public void setPrevious(YGNode previous) {
        this.previous = previous;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public YGNode getNext() {
        return next;
    }

    public void setNext(YGNode next) {
        this.next = next;
    }
}