package Level6;

public class _128RecurrsionPrintN {

    static void printNumber(int n){

        if(n==0) return ;
        System.out.print(n+" ");

         printNumber(n-1);
    }

    public static void main(String[] args) {
        int n= 10;
        printNumber(5);
    }
}
