package Level6;

public class _132SumOfDigit {

     static int sumOfDigit(int n){

        if(n<0) return -n;
if(n==0 ) return n;

return n%10 + sumOfDigit(n/10);

    }

    public static void main(String[] args) {
        int n= 11;

int x= sumOfDigit(n);
        System.out.println(x);
    }
}


