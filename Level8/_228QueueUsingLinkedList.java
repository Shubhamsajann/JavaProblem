

package Level8;

public class _228QueueUsingLinkedList {

static  class Node{



    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}



static Node front = null;
static Node rear = null;


    static  void enqueue(int value){
      Node newNode = new Node(value);

      if(rear== null){

       front=rear=newNode;
       return;
      }

      rear.next=newNode;
      rear=newNode;



    }

    static void dequeue() {
        if (front ==  null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Removed: " + front.data);
        front = front.next;

        if(front==null) rear = null;
    }

    static void peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Peek: " + front.data);

    }

    public static void display(){

        Node temp =front;

     while (temp!=null){
         System.out.print(temp.data+" ");
         temp=temp.next;
     }
        System.out.println();


    }


    public static void main(String[] args) {


        enqueue(10);
        enqueue(20);
        enqueue(30);

        display();
        peek();
        dequeue();
        display();

    }
}

