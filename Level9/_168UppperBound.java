package Level9;

public class _168UppperBound {


    public static int upperBound(int[] arr, int target){

      int left =0;
      int right = arr.length;

      while(left<right){

          int mid = left + (right - left) / 2;



           if(arr[mid] <= target)  left=mid+1;

          else right=mid;
      }


        return left;

    }


    public static void main(String[] args) {
        int[] arr = {1,3,4,6};
        int target = 5;



        int result  = upperBound(arr, target);

        if (result < arr.length) {
            System.out.println("Upper bound found at index: " + result + " (Value: " + arr[result] + ")");
        } else {
            System.out.println("No element greater than target found. Upper bound index is at the end: " + result);
        }

    }


}

