package Level2;

// Two Sum using Brute Force
public class _49Problem {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 2};
        int target = 6;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {

                    System.out.println(
                            arr[i] + " + " + arr[j] + " = " + target
                    );
                }
            }
        }
    }
}