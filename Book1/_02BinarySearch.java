package Book1;

public class _02BinarySearch {

    public static void main(String[] args) {
        int[] arr ={10,20,30,40};
        int target =40;

      int low =0;
      int high  =arr.length-1;
      int found =-1;

      while (low<=high){
          int mid = low+high/2;

          if(arr[mid] == target){
            found=mid;
            break;
          }

          else if(arr[mid]<target){
              low=mid+1;
          }
          else high=mid-1;
      }

        if (found != -1) {
            System.out.println("Element found at index: " + found);
        } else {
            System.out.println("Element not found");
        }
    }

}
