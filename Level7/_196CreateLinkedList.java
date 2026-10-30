package Level7;

public class _196CreateLinkedList {

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

            first.next=second;
            second.next=null;


            Node current = first;

            while (current!=null){
                System.out.print(current.data+"->");
                current=current.next;
            }
            System.out.print("null");
        }
    }

