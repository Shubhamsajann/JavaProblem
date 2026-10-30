package Level0;

import java.util.Scanner;

class _07Problem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = sc.nextInt();

      int res =findmax(a,b);
        System.out.println(res);
    }
    public static int findmax(int a , int b){

        if(a>b) return a;
        else return b;
    }
}