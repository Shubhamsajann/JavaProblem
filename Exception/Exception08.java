package Exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exception08 {




        public static void main(String[] args) {

            try {
                FileReader reader = new FileReader("Exception/test.txt");

                int ch;

                while ((ch = reader.read()) != -1) {
                   System.out.print((char) ch);
               }
                System.out.println("file found");
            }
            catch (IOException e){
                System.out.println("File error: " + e.getMessage());
            }


        }
    }