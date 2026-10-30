package Level7;

public class _211Insertnodesusingforloop {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

        public static void main(String[] args) {

            Node first = null;
            Node tail = null;

            int[] arr = {10, 20, 30, 40, 50};

            for (int value : arr) {
                Node newNode = new Node(value);

                if (first == null) {
                    first = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
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

