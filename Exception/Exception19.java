package Exception;

public class Exception19 {

    static void checkAge(int age) throws  InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("age must be greater then 18");
        }
        System.out.println("Eligible to vote");

    }
    public static void main(String[] args) {

        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program completed");
    }
}
