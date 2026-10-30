
package Level1;

public class _29Problem {
    public static void main(String[] args) {

        int[] arr = {10, 15, 20, 7, 8, 12};

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;



        for (int num : arr) {

            if (num <  0) {
                negativeCount++;
            } else if(num> 0) {
               positiveCount++;
            }
            else {
                zeroCount++;
            }
        }

        System.out.println("Positive = " + positiveCount);
        System.out.println("Negative = " + negativeCount);
        System.out.println("Zero = " + zeroCount);

    }
}
