package CoreJava;

public class _03IsPrime {
    public static void main(String[] args) {

        int n = 17;
        boolean isPrime = true;

        if (n < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n / i; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}
