
package Level7;

public class _218SortLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Merge two sorted lists
    static Node merge(Node a, Node b) {

        Node dummy = new Node(0);
        Node tail = dummy;

        while (a != null && b != null) {

            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }

            tail = tail.next;
        }

        if (a != null) {
            tail.next = a;
        } else {
            tail.next = b;
        }

        return dummy.next;
    }

    // Find the middle, split, and sort both halves
    static Node sortList(Node first) {

        if (first == null || first.next == null) {
            return first;
        }

        Node slow = first;
        Node fast = first;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node second = slow.next;
        slow.next = null;

        Node left = sortList(first);
        Node right = sortList(second);

        return merge(left, right);
    }

    public static void main(String[] args) {

        Node first = new Node(30);
        first.next = new Node(10);
        first.next.next = new Node(40);
        first.next.next.next = new Node(20);

        first = sortList(first);

        Node temp = first;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
