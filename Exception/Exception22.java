package Exception;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Exception22 {

    public static void main(String[] args) {

        try (
                FileReader reader = new FileReader("Exception/test.txt");
                BufferedReader br = new BufferedReader(reader)
        ) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        System.out.println("Program completed");
    }
}