package Level6;

public class _130Factroial {

     static long factorial(int n){

        if(n<0) throw new IllegalArgumentException("No factoial of negative number");
if(n==0 || n==1) return 1;

return n*factorial(n-1);

    }

    public static void main(String[] args) {
        int n= 5;

Long x= factorial(n);
        System.out.println(x);
    }
}


