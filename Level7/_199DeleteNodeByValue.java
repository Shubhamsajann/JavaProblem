package Level7;

public class _199DeleteNodeByValue {

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

            int target  =20;

            if(first != null && first.data == target) {
                first=first.next;
            }
            else {
                Node current = first;

                while (current !=null && current.next!=null && current.next.data!=target){
                    current= current.next;
                }

                if(current!=null && current.next!=null){
                    current.next=current.next.next;
                }

            }




            Node current = first;


            while (current!=null){
                System.out.print(current.data+"->");
                current=current.next;
            }
            System.out.print("null");
        }
    }

