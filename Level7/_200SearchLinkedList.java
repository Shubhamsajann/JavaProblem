package Level7;

public class _200SearchLinkedList {

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


            int target =20;
            boolean found = false;


            Node current = first;

            while (current!=null){
         if(current.data==target){
             found=true;
             break;
         }

                current=current.next;
            }
            System.out.print("found "+found);
        }
    }

