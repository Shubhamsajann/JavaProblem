package Exception;

public class Exception13 {

    public  static void method3(){
        int result = 10/0;
    }

    public static void method2(){
        try {
            method3();
        }
        catch (ArithmeticException e){
            System.out.println("Diviude  by zero");
        }

    }

    public static void main(String[] args) {

        method2();
        System.out.println("Main executedd");
    }
}
