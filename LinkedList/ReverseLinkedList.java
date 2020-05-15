package com.linkedlist;

/**
 * https://leetcode.com/problems/reverse-linked-list/
 * Time complexity : O(n)
 * Space complexity : O(1)
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return head;
        }

        ListNode current = head;
        ListNode next = null;
        ListNode previous = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }

        return previous;

    }
}
}
