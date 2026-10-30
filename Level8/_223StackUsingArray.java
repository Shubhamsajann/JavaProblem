package Level8;

public class _223StackUsingArray {

 static    int[] statck = new int[5];
  static   int top=-1;


  static  void push(int value){
      if(top == statck.length-1){
          System.out.println("Stack OverFlow");
          return;
      }
      top++;
      statck[top]=value;

  }

  static  void pop(){
      if(top == -1){
          System.out.println("Stack Underflow");
          return;
      }
      System.out.println("Removed: "+statck[top]);
      top--;
  }
    static  void peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top: "+statck[top]);

    }

    static  void display(){
      if(top==-1){
          System.out.println("Stack is empty");
          return;
      }
        for (int i = top; i >=0 ; i--) {
            System.out.println(statck[i]);

        }
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);

        peek();
        pop();
        display();
    }

}
