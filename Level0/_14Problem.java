package Level0;

import java.util.Scanner;

class _14Problem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

Student s = new Student();
s.age=10;
s.name="shubham";

        System.out.println(s.name);
        System.out.println(s.age);

    }



}

class Student{
    String name;
    int age;

}