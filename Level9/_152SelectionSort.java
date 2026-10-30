package Level9;

import java.util.Arrays;

public class _152SelectionSort {


    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1};


        for (int i = 0; i <arr.length-1 ; i++) {


            for (int j = i+1;j<arr.length;j++) {

                if(arr[i]>arr[j]){

                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }
}

