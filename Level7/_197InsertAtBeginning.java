package Level7;

public class _197InsertAtBeginning {

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


            Node newNode = new Node(5);

            newNode.next=first;
            first=newNode;

            Node current = first;

            while (current!=null){
                System.out.print(current.data+"->");
                current=current.next;
            }
            System.out.print("null");
        }
    }

