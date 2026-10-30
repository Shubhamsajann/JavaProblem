package Important_Promnlems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _1ReverseArray {

    public static  void reverse(int[] arr)
    {

        int left =0;
        int right = arr.length-1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }


    }

    public static void main(String[] args) {
        int[] arr ={10,30,40,50,60};
        reverse(arr);
        for(int a : arr){
            System.out.print(a+" ");
        }
    }
}
