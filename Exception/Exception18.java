package Exception;

public class Exception18 {

    public static void main(String[] args) {
        String name = null;


        try {
            int[] arr = {10, 20, 30};

            System.out.println(arr[5]);
            System.out.println(name.length());


        }
        catch (ArrayIndexOutOfBoundsException |NullPointerException | ArithmeticException e) {
            System.out.println("Exception handled");
        }


        System.out.println("Program completed");
    }

}
