package Level9;

public class _169LowerBound {


    public static int LowerBound(int[] arr, int target){

      int left =0;
      int right = arr.length;

      while(left<right){

          int mid = left + (right - left) / 2;



           if(arr[mid] < target)  left=mid+1;

          else right=mid;
      }


        return left;

    }


    public static void main(String[] args) {
        int[] arr = {1,3,4,6};
        int target = 5;



        int result  = LowerBound(arr, target);

        if (result < arr.length) {
            System.out.println("Lower bound found at index: " + result + " (Value: " + arr[result] + ")");
        } else {
            System.out.println("No element smaller  than target found. Lower bound index is at the end: " + result);
        }

    }


}

