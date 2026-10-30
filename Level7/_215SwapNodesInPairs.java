
package Level7;

public class _215SwapNodesInPairs {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Node first = new Node(10);
        first.next = new Node(20);
        first.next.next = new Node(30);
        first.next.next.next = new Node(40);

        Node dummy = new Node(0);
        dummy.next = first;

        Node current = dummy;

        while (current.next != null && current.next.next != null) {

            Node firstNode = current.next;
            Node secondNode = current.next.next;

            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
            current.next = secondNode;

            current = firstNode;
        }

        first = dummy.next;

        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
