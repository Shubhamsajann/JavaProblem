package Exception;

public class Exception03 {

        public static void main(String[] args) {
            try {
                System.out.println("Before exception");
                int result = 10 / 0;
            } finally {
                System.out.println("Cleanup executed");
            }
        }
    }