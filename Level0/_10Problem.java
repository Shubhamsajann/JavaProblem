package Level0;

import java.util.Scanner;

class _10Problem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    String name ="shubham";
        String reverse ="";

        for (int i = name.length()-1; i >=0 ; i--) {

    reverse+=name.charAt(i);
        }
        System.out.print(reverse);
    }
}