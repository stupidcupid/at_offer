package com.offer.utils;

/**
 * Created by nanzhou on 2017/10/12.
 */
public class ListNode {

    int val;

    ListNode next = null;


    ListNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
