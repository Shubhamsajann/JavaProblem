public class _15MaximumSubArray {

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int ans = maxSubarraySum(arr);

        System.out.println(ans);

    }

    private static int maxSubarraySum(int[] arr) {
        int currsum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i <arr.length ; i++) {

            currsum =Math.max(arr[i],currsum + arr[i]);
            maxSum = Math.max(maxSum, currsum);

        }

        return maxSum;
    }



}
