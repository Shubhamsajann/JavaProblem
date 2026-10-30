package Level7;

public class _214NthNodeFromEnd {

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

            int n =2;
            Node fast = first;
            Node slow = first;

            for (int i = 0; i < n; i++) {
                if(fast==null){
                    System.out.println("Invalid");
                    return;
                }
                fast=fast.next;
            }


            while (fast != null) {
      fast=fast.next;
                slow = slow.next;
            }


            System.out.println(slow.data);
        }
    }

