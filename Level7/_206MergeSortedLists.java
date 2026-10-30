package Level7;

public class _206MergeSortedLists {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

        public static void main(String[] args) {
            // First sorted list: 10 -> 30 -> 50
            Node a = new Node(10);
            a.next = new Node(30);
            a.next.next = new Node(50);

            // Second sorted list: 20 -> 40 -> 60
            Node b = new Node(20);
            b.next = new Node(40);
            b.next.next = new Node(60);


            Node dummy = new Node(0);
            Node tail = dummy;




            while (a != null && b != null){

                if(a.data<=b.data){
                    tail.next=a;
                    a=a.next;

                }
                else {
                    tail.next=b;
                    b=b.next;
                }

                tail=tail.next;
            }

            if (a != null) {
                tail.next = a;
            } else {
                tail.next = b;
            }

            Node current = dummy.next;



            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }

            System.out.println("null");
        }
    }

