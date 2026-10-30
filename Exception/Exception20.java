package Exception;

public class Exception20 {

    static void withdraw(double balance , double amount) throws InsufficientBalanceFundException{
        if(amount>balance){
            throw  new InsufficientBalanceFundException("Insufficent account balance ");
        }
        System.out.println("withdraw successful");
    }
    public static void main(String[] args) {

        try {
            withdraw(1000, 1500);
        } catch (InsufficientBalanceFundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Transaction completed");
    }
}
