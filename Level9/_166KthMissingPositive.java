package Level9;

class _166KthMissingPositive {
//This is a Binary Search interview problem. Given a sorted array of positive integers, find the \(k\)-th positive number missing from the array.

    public static int findKthPositive(int[] arr,int k){

        int left =0;
        int right = arr.length-1;



      while(left<right) {

          int mid = left + (right - left) / 2;

          int missing = arr[mid]-(mid+1);
          if(missing <k ){
              left=mid+1;
          }
else {
              right = mid-1;
          }
      }

        return left + k;

    }




    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};

        int k = 5;
        System.out.println(findKthPositive(arr, k));

    }


}

