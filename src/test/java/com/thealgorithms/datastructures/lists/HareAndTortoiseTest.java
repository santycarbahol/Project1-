package com.thealgorithms.datastructures.lists;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Tests for the HareAndTortoise class that implements Floyd's Cycle Detection algorithm.
 */
public class HareAndTortoiseTest {

    @Test
    public void testHasCycle() {
        // Case 1: Creating a linked list with a cycle
        HareAndTortoise.ListNode head1 = new HareAndTortoise.ListNode(1);
        HareAndTortoise.ListNode node2 = new HareAndTortoise.ListNode(2);
        head1.next = node2;
        node2.next = head1;  // Creates a cycle
        assertTrue(HareAndTortoise.hasCycle(head1), "List should detect a cycle.");

        // Case 2: Creating a linked list without a cycle
        HareAndTortoise.ListNode head2 = new HareAndTortoise.ListNode(1);
        head2.next = new HareAndTortoise.ListNode(2);
        assertFalse(HareAndTortoise.hasCycle(head2), "List should not detect any cycle.");
    }
}
