package Level7;

public class _204DetectCycle {

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
            Node second = new Node(20);
            Node third = new Node(30);

            first.next = second;
            second.next = third;
            third.next=second;

            Node slow =first;
            Node fast = first;
            boolean hasCycle = false;

            while (fast != null && fast.next != null){
                slow=slow.next;
                fast=fast.next.next;

                if (slow == fast) {
                    hasCycle = true;
                    break;
                }
            }


            System.out.println("Cycle exists: " + hasCycle);

        }
    }

