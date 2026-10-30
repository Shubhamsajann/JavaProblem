package Exception;

public class Exception16 {

    public static void main(String[] args) {

        try{
            try{
                int result =10/0;


            }
            catch (ArithmeticException e){
                System.out.println("Inner exception handled");
            }
            int[] arr ={1,2,3};
            System.out.println(arr[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Outter Exception handled");
        }
        System.out.println("Program completed");
    }

}
