
package Level7;

public class _217RotateLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node rotateRight(Node first, int k) {

        if (first == null || first.next == null || k == 0) {
            return first;
        }

        Node tail = first;
        int length = 1;

        // Find the last node and list length
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Avoid unnecessary rotations
        k = k % length;

        if (k == 0) {
            return first;
        }

        // Connect the last node to the first
        tail.next = first;

        // Find the new last node
        int steps = length - k;
        Node newTail = first;

        for (int i = 1; i < steps; i++) {
            newTail = newTail.next;
        }

        // Set the new head and break the circle
        Node newFirst = newTail.next;
        newTail.next = null;

        return newFirst;
    }

    public static void main(String[] args) {

        Node first = new Node(10);
        first.next = new Node(20);
        first.next.next = new Node(30);
        first.next.next.next = new Node(40);
        first.next.next.next.next = new Node(50);

        int k = 2;

        first = rotateRight(first, k);

        Node temp = first;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
