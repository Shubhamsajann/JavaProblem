package Level9;

class _161FindMinimumRotatedArray  {


    public static int findMin(int[] arr){

      int left =0;
      int right = arr.length-1;

      while(left<right){

          int mid = left + (right - left) / 2;



           if(arr[mid] >  arr[right])  left=mid+1;

          else right=mid-1;
      }


        return arr[left];

    }


    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1};
        int target = 8;



        int result  = findMin(arr);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

    }


}

