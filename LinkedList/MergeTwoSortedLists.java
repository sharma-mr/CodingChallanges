package com.linkedlist;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * Time complexity : O(n + m)
 * Space complexity : O(1)
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode dummyList = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                dummyList.next = l1;
                l1 = l1.next;
            } else {
                dummyList.next = l2;
                l2 = l2.next;
            }
            dummyList = dummyList.next;
        }
        if (l1 != null) {
            dummyList.next = l1;
        }
        if (l2 != null) {
            dummyList.next = l2;
        }

        return dummy.next;
    }
}
