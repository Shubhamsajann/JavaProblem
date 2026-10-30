
package Level7;

public class _216ReverseInGroups {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node reverseKGroup(Node first, int k) {

        Node current = first;
        Node previous = null;
        Node nextNode = null;

        int count = 0;
        Node temp = first;

        // Check whether k nodes are available
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        // Reverse the available group
        if (count == k) {
            current = first;
            count = 0;

            while (current != null && count < k) {
                nextNode = current.next;
                current.next = previous;
                previous = current;
                current = nextNode;
                count++;
            }

            // Connect this group to the remaining list
            if (nextNode != null) {
                first.next = reverseKGroup(nextNode, k);
            }

            return previous;
        }

        // Leave an incomplete group unchanged
        return first;
    }

    public static void main(String[] args) {

        Node first = new Node(10);
        first.next = new Node(20);
        first.next.next = new Node(30);
        first.next.next.next = new Node(40);
        first.next.next.next.next = new Node(50);

        int k = 2;

        first = reverseKGroup(first, k);

        Node temp = first;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
