package Exception;

public class Exception02 {


    public static void main(String[] args) {

        int a  =20;
        int b =0;

        int[] arr ={10,20,30,40,50};
        try{

            System.out.println(arr[5]);
            int result = a/b;
            System.out.println(result);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dont mess with array");
        }
        catch (ArithmeticException e){
            System.out.println("Dont mess with 0");

        }
        finally {
            System.out.println("And finnaly");
        }
        System.out.println("End of program");
    }
}
