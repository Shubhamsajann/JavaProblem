
package Exception;

public class Exception21 {


    static  void checkPassword(String  password) throws  InvalidPasswordException{
        if(password.length()< 8){
            throw new InvalidPasswordException("Password must contain at least 8 characters");
        }

    }

    public static void main(String[] args) {
        try{
            checkPassword("Java123");
        }
        catch (InvalidPasswordException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Program completed");
    }

}
