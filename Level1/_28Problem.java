
package Level1;

public class _28Problem {
    public static void main(String[] args) {

        int[] arr = {10, 15, 20, 7, 8, 12};

        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even = " + evenCount);
        System.out.println("Odd = " + oddCount);
    }
}
