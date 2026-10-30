package Important_Promnlems;

public class _14MaximumSubArray {

    public static int maxsubarray(int[] arr) {

       int currsum = arr[0];
        int maxsum = arr[0];

       for (int i = 0; i < arr.length; i++) {

           currsum=Math.max(arr[i],currsum+arr[i]);

           maxsum=Math.max(maxsum,currsum);
        }
       return maxsum;

    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        int ans = maxsubarray(arr);

        System.out.println(ans);
    }
}