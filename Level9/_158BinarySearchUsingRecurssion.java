package Level9;

public class _158BinarySearchUsingRecurssion {


    public static int binarySearch(int[] arr,int left , int right,  int target){

        if (left > right) {
            return -1;
        }

   int mid = left+(right-left)/2;

if(arr[mid] == target) return mid;
else if(arr[mid]<target) {
    return binarySearch(arr,mid+1,right,target);
}
else {
    return binarySearch(arr,left,mid-1,target);
}

    }


    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1};
        int target = 8;



        int result  = binarySearch(arr, 0,arr.length-1, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

    }


}

