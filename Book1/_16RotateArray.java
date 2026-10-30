
package Book1;

import java.util.Arrays;

public class _16RotateArray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        int[] k = rotate(arr, 2);

        System.out.println(Arrays.toString(k));
    }

    public static void reverse(int[] arr, int i, int j) {

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static int[] rotate(int[] arr, int k) {

        int n = arr.length;

        if (n == 0) {
            return arr;
        }

        k = k % n;

        // Reverse the entire array
        reverse(arr, 0, n - 1);

        // Reverse the first k elements
        reverse(arr, 0, k - 1);

        // Reverse the remaining elements
        reverse(arr, k, n - 1);

        return arr;
    }
}
