package Exception;

import java.io.IOException;

public class Exception07 {


    static void readFile() throws IOException{
        throw new IOException("File cannot be read");
    }

        public static void main(String[] args) {


        try{
            readFile();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        }
    }