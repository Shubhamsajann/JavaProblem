package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exception23 {

    public static void main(String[] args) {

        String name =null;
        try {
            name.toUpperCase();

        }
        catch (NullPointerException e){
            System.out.println("Cannot convert a null string");
        }

        System.out.println("Program completed ");
    }
}