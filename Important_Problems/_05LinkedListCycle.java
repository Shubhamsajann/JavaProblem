package Important_Problems;

import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class _05LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        // Write your logic here
        if(head == null || head.next==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }


        return false;

    }


    public static void main(String[] args) {
        // Construct: 3 -> 2 -> 0 -> -4 -> (loops back to 2)
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Creates the cycle

        System.out.println("Has cycle: " + hasCycle(head)); // Output: true
    }
}
