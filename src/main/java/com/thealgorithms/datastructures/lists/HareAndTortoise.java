package com.thealgorithms.datastructures.lists;

/**
 * Implements Floyd's Cycle Detection algorithm, also known as the Hare and Tortoise algorithm,
 * which is used to detect cycles in linked lists.
 */
public class HareAndTortoise {

    /**
     * Uses two pointers moving at different speeds to determine if a cycle exists in the list.
     *
     * @param head the head node of the linked list
     * @return true if there is a cycle in the list, false otherwise
     */
    public static boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;  // This pointer moves one step at a time
        ListNode fast = head;  // This pointer moves two steps at a time

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move slow pointer by one step
            fast = fast.next.next;     // move fast pointer by two steps

            if (slow == fast) {        // A cycle is detected if the slow and fast pointers meet
                return true;
            }
        }

        return false;  // No cycle found if fast pointer reaches the end of the list
    }

    /**
     * Inner class to define the structure of nodes in the linked list.
     */
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
