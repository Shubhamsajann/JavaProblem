package Level7;

public class _201LengthOfLinkedList {

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


            int count =  0;
            Node current = first;


            while (current!=null){
                count++;
                current=current.next;
            }
            System.out.print("length"+count);
        }
    }

