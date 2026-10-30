package Level9;

class _165SingleElement {

//Every element appears exactly twice except one element, which appears only once. Find that single element in a sorted array.

    public static int singleNonDuplicate(int[] arr){

        int left =0;
        int right = arr.length-1;



      while(left<right) {

          int mid = left + (right - left) / 2;

          if(mid %2 == 1){
              mid--;

          }
if(arr[mid]== arr[mid+1]){

              left = mid + 2;

          }
else {
              right = mid;
          }
      }

return arr[left];

    }




    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};

        System.out.println("Single element: "
                + singleNonDuplicate(arr));

    }


}

