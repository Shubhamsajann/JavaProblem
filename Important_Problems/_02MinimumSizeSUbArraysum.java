package Important_Problems;

import java.util.HashMap;

public class _02MinimumSizeSUbArraysum {

    public static int minSubArrayLen(int target, int[] arr ){

        if (arr == null || arr.length == 0) {
            return 0;
        }

        int minSize = Integer.MAX_VALUE;
        int sum =0;
        int left =0;

        for (int right=0;right<arr.length;right++) {
            sum += arr[right];

            while (sum >= target) {
                minSize = Math.min(minSize, right - left + 1);
                sum -= arr[left];
                left++;
            }


        }
        return minSize==Integer.MAX_VALUE ? 0 : minSize;

    }

    public static void main(String[] args) {
    int[] arr = {2,3,1,2,4,3};
    int target =7;

        System.out.println(minSubArrayLen(target, arr));

    }
}
