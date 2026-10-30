package Level7;

public class _210RemoveDuplicates {

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
            first.next = new Node(10);
            first.next.next = new Node(20);
            first.next.next.next = new Node(20);
            first.next.next.next.next = new Node(30);

            Node current = first;



            while (current != null && current.next != null) {

                if (current.data == current.next.data) {
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }


            Node temp = first;

            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }

            System.out.println("null");


        }
    }

