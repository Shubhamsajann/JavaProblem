package Exception;

import java.io.IOException;

public class Exception11 {

    public static void main(String[] args) {
        try {

            String name = "abc";
            int n = Integer.parseInt(name);
        } catch (NumberFormatException e) {
            System.out.println("Invalid format");
        }
        System.out.println("program executed");
    }
}
