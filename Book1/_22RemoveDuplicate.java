
package Book1;

import java.util.Arrays;
import java.util.HashMap;

public class _22RemoveDuplicate {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,5, 6};



        int[] a = removeDuplicate(arr);
        System.out.println(Arrays.toString(a));
    }

    public static int[] removeDuplicate(int[] arr) {


        int j = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];


            }
        }
        return Arrays.copyOf(arr, j + 1);

    }
}
