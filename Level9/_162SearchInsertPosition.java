package Level9;

class _162SearchInsertPosition {


    public static int searchInsert(int[] arr,int target){

      int left =0;
      int right = arr.length-1;

      while(left<right){

          int mid = left + (right - left) / 2;

if(arr[mid] == target) return mid;


else if(arr[mid] <  target)  left=mid+1;

          else right=mid-1;
      }


        return left;

    }


    public static void main(String[] args) {
        int[] arr = {1,2,34,35};
        int target = 5;


        System.out.println(searchInsert(arr, target));

    }


}

