package Important_Problems;

public class _03ContainerWithMostWater {

    public static int maxArea(int[] height) {
        // Write your logic here

        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left<right) {

            int width = right - left;

            int currentArea = Math.min(height[left], height[right]) * width;
            maxWater = Math.max(maxWater, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }


        }



        return maxWater;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height)); // Expected: 49
    }
}
