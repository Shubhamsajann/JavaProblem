package Exception;

public class Exception05 {

    public static int getNumber( ){

        try {

            int result = 10 / 0;
        } finally {
            return 20;
        }
    }
        public static void main(String[] args) {
            System.out.println(getNumber());
        }
    }