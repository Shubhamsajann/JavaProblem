package Level2;

import java.util.Arrays;

// Container With Most Water
public class _61Problem {

    public static void main(String[] args) {

        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int left =0,right =arr.length-1;

        int maxArea = 0;

        while(left<right){
            int width = right-left;

            int height = Math.min(arr[left],arr[right]);

            int area = width* height;
            maxArea =Math.max(area,maxArea);

            if(arr[left]<arr[right]) left++;
            else right--;
        }
        System.out.println(maxArea);



    }
}