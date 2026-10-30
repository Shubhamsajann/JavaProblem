package Level9;

public class _170CountOccurence {


    public static int lowerBound(int[] arr, int target){

      int left =0;
      int right = arr.length;

      while(left<right){

          int mid = left + (right - left) / 2;



           if(arr[mid] < target)  left=mid+1;

          else right=mid;
      }


        return left;

    }


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


        int first = lowerBound(arr, target);
        int last = upperBound(arr, target);

        System.out.println(last - first);


    }


}

