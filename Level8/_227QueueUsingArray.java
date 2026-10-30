

package Level8;

import java.util.Stack;

public class _227QueueUsingArray {

    static int[] queue = new int[5];
    static  int front = 0 ;
    static  int rear  = -1;

    static  void enqueue(int value){
        if(rear == queue.length){
            System.out.println("Queue is full");
            return;
        }
        queue[++rear] =value;
        System.out.println("Inserted: " + value);

    }

    static void dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Removed: " + queue[front]);
        front++;
    }

    static void peek() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Removed: " + queue[front]);

    }

    public static void display(){
        if(front > rear){
            System.out.println("Empty");
            return;
        }
        for (int i=front;i<=rear;i++){
            System.out.println(queue[i]+" ");

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

