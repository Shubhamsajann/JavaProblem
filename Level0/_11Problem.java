package Level0;

import java.util.Scanner;

class _11Problem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    String name ="java";
        StringBuilder builder=new StringBuilder(name);


       builder.reverse();
        System.out.println(builder);
    }
}