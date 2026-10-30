

package Level8;

public class _229CircularQueue {



static int[] queue = new int[5];
static int front =-1;
static  int rear = -1;


    static  void enqueue(int value){
    if((rear+1)%queue.length==front){
        System.out.println("Queue is full");
        return;
    }
    if (front==-1){
        front=0;
    }

    rear=(rear+1)% queue.length;
    queue[rear]=value;
        System.out.println("Inserted "+value);



    }

    static void dequeue() {
        if (front ==  -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Removed: " + queue[front]);

        if (front == rear) {
            front = rear = -1;
        }

        else front=(front+1)%queue.length;
    }

    public  static void display(){


        if(front==-1)
        {
            System.out.println("Queue is empty");
            return;
        }


        int i=front;

        while (true) {
            System.out.print(queue[i] + " ");

            if (i == rear) {
                break;
            }

            i = (i + 1) % queue.length;
        }
        System.out.println();


    }


    public static void main(String[] args) {


        enqueue(10);
        enqueue(20);
        enqueue(30);

        display();
        dequeue();
        display();

    }
}

