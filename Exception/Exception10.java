package Exception;

import java.io.IOException;

public class Exception10 {

    public static  void readData() throws IOException{
        throw new IOException("Unable to read");
    }

    public static void main(String[] args) {
        try {
            readData();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
