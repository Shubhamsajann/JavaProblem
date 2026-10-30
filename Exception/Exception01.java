package Exception;

public class Exception01 {


    public static void main(String[] args) {

        int a  =20;
        int b =0;

        try{
            int result = a/b;
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println("Dont mess");

        }
        System.out.println("End of program");
    }
}
