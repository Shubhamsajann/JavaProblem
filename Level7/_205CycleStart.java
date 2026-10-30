package Level7;

public class _205CycleStart {

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
            Node fourth = new Node(40);
            Node fifth = new Node(50);

            first.next = second;
            second.next = third;
            third.next = fourth;
            fourth.next = fifth;
            fifth.next = third; // Cycle starts at 30


            Node slow =first;
            Node fast = first;


            while (fast != null && fast.next != null){
                slow=slow.next;
                fast=fast.next.next;

                if (slow == fast) {
                    break;
                }
            }
if(fast == null || fast.next == null) {
    System.out.println("No Cycyle ");
    return;
}
slow = first;

while (slow != fast){
    slow=slow.next;
    fast=fast.next;
}
            System.out.println("Cycle starts at: " + slow.data);
        }
    }

