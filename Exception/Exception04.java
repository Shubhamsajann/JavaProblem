package Exception;

public class Exception04 {

        public static void main(String[] args) {
            try {
                System.out.println("TRY");
                System.exit(0);
                int result = 10 / 0;
            } finally {
                System.out.println("Finally executed");
            }
        }
    }