package Important_Problems.Revise;

public class _03ContainerWIthMostWater {


    static int mostWater(int[] arr){
        int left =0;
        int right = arr.length-1;
        int maxWater =0;

        while (left<right){

            int width = right-left;

            int currentArea = Math.min(arr[left],arr[right])*width;

            maxWater = Math.max(maxWater,currentArea);

            if(arr[left]<arr[right]){
                left++;
            }
            else {
                right--;
            }
        }
        return maxWater;
    }


    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(mostWater(height)); // Expected: 49
    }
}
