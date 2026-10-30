package Exception;

public class Exception17 {

    public static void main(String[] args) {

        try {
            int result = 10 / 0;

            System.out.println(result);
        }
            catch (ArithmeticException | NullPointerException e){
                System.out.println("Exception handled: " + e);
            }


        System.out.println("Program completed");
    }

}
