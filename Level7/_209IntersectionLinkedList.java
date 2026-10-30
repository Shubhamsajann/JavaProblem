package Level7;

import java.util.ArrayList;

public class _209IntersectionLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

        public static void main(String[] args) {
            // Shared nodes
            Node common1 = new Node(30);
            Node common2 = new Node(40);
            Node common3 = new Node(50);

            common1.next = common2;
            common2.next = common3;

            // List A: 10 -> 20 -> 30 -> 40 -> 50
            Node headA = new Node(10);
            headA.next = new Node(20);
            headA.next.next = common1;

            // List B: 15 -> 30 -> 40 -> 50
            Node headB = new Node(15);
            headB.next = common1;


            Node a = headA;
            Node b = headB;


            while (a != b) {

                if (a == null) {
                    a = headB;
                } else {
                    a = a.next;
                }

                if (b == null) {
                    b = headA;
                } else {
                    b = b.next;
                }
            }


            if (a != null) {
                System.out.println("Intersection: " + a.data);
            } else {
                System.out.println("No intersection");
            }

        }
    }

