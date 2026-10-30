package Level6;

public class _131Fibonacci {

     static long fibonacci(int n){

        if(n<0) throw new IllegalArgumentException("No factoial of negative number");
if(n==0 || n==1) return n;

return fibonacci(n-1)+fibonacci(n-2);

    }

    public static void main(String[] args) {
        int n= 5;

Long x= fibonacci(n);
        System.out.println(x);
    }
}


