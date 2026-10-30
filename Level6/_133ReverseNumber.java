package Level6;

public class _133ReverseNumber {

    public static int reverse(int n) {
        return reverseHelper(n, 0);
    }

    private static int reverseHelper(int n, int result) {

        if (n == 0) return result;

        int digit = n%10;

         result = result *10 +digit;

         return reverseHelper(n/10,result);


    }

    public static void main(String[] args) {
        int n= 12;

int x= reverse(n);
        System.out.println(x);
    }
}


