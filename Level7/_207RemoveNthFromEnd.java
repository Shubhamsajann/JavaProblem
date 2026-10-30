package Level7;

public class _207RemoveNthFromEnd {

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
            first.next.next.next.next = new Node(50);


            int n =2;
            Node dummy = new Node(0);

            dummy.next=first;

            Node fast = dummy;
            Node slow = dummy;

            for (int i = 0; i <=n ; i++) {
                fast=fast.next;

            }
            while (fast!=null){
                fast=fast.next;
                slow=slow.next;

            }

            slow.next=slow.next.next;
            first=dummy.next;

            Node current = first;

            while (current!=null){
                System.out.print(current.data+"->");
                current=current.next;
            }
            System.out.print("null");
        }
    }

