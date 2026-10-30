package Important_Promnlems;

public class _19mximumConsecutive {

    public static int maxConsicativeOnes(int[] arr) {

        int count = 0;
        int maxCount = 0;

        for (int x : arr) {

            if (x == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {

        int[] arr = {1, 0, 1, 0, 0, 0, 1, 1, 1, 1};

        int result = maxConsicativeOnes(arr);

        System.out.println(result);
    }
}