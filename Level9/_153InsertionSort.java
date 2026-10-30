package Level9;

import java.util.Arrays;

public class _153InsertionSort {


    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1};


        for (int i = 0; i <arr.length-1 ; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j>=0 &&arr[i]>key ){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));

    }
}

