package Level9;

import java.util.Arrays;

public class _159FirstLastPosition {


    public static int[] searchRange(int[] arr, int target) {

        int first = findFirst(arr, target);
        int last = findLast(arr, target);

        return new int[]{first, last};

    }



    public static int findFirst(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left<=right){
            int mid = left + (right - left) / 2;

            if(arr[mid]==target) {
                result= mid;
                right=mid-1;
            }
            else if(arr[mid] < target){
                left=mid+1;
            }
            else right=mid-1;

        }
        return result;

    }

    public static int findLast(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left<=right){
            int mid = left + (right - left) / 2;

            if(arr[mid]==target) {
                result= mid;
                left=mid+1;
            }
            else if(arr[mid] < target){
                left=mid+1;
            }
            else right=mid-1;

        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1,8};
        int target = 8;


        System.out.println(Arrays.toString(searchRange(arr, target)));
        }

    }




