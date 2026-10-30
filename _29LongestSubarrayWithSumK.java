import java.util.HashMap;

public class _29LongestSubarrayWithSumK {

    public static int longestSubarray(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // Subarray starts from index 0
            if (sum == k) {
                maxLength = i + 1;
            }

            // Check if required prefix exists
            if (map.containsKey(sum - k)) {

                int length = i - map.get(sum - k);

                maxLength = Math.max(maxLength, length);
            }

            // Store only first occurrence
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 2, 7, 1, 9};

        int k = 15;

        System.out.println(longestSubarray(arr, k));
    }
}