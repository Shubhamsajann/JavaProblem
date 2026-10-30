package Level7;

public class _202ReverseLinkedList {

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

            first.next=second;
            second.next=third;

            Node previous = null;
            Node current = first;

            while (current != null){
                Node nextNode = current.next;
                current.next=previous;
                previous=current;
                current=nextNode;
            }

            first=previous;

            Node temp = first;

            while (temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.print("null");
        }
    }

