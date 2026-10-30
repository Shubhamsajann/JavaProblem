
package Important;

import java.util.Arrays;

public class _01Merge {

    public static void merge(int[] arr, int l, int mid, int r) {

        int[] c = new int[r - l + 1];

        int i = l;
        int j = mid + 1;
        int k = 0;

        // Compare elements from both halves
        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                c[k++] = arr[i++];
            } else {
                c[k++] = arr[j++];
            }
        }

        // Copy remaining left-half elements
        while (i <= mid) {
            c[k++] = arr[i++];
        }

        // Copy remaining right-half elements
        while (j <= r) {
            c[k++] = arr[j++];
        }

        // Copy temporary array back to original array
        for (int x = l, y = 0; x <= r; x++, y++) {
            arr[x] = c[y];
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {

        if (l < r) {
            int mid = l + (r - l) / 2;

            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            merge(arr, l, mid, r);
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 50, 15, 40};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
