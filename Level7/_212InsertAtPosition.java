package Level7;

public class _212InsertAtPosition {

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
            int value =15;
            int position =1;


            Node newNode = new Node(value);

            if(position == 0) {
                newNode.next = first;
                first=newNode;
            }
            else {
                Node current = first;
                for (int i = 0; i <position-1 ; i++) {

                    if(current==null){
                    break;
                    }
                    current=current.next;
                }
                if(current==null){
                    System.out.println("Invalid position");
                    return;
                }
                newNode.next = current.next;
                current.next=newNode;
            }
            Node temp = first;

            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");

        }
    }

