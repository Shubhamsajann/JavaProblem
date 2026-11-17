
package Day02;

import java.util.Arrays;

public class MergeSort {

    static void mergeSort(int[] arr, int noOfElement) {

        if (noOfElement <= 1) {
            return;
        }

        int mid = noOfElement / 2;

        int[] LeftArr = new int[mid];
        int[] RightArr = new int[noOfElement - mid];

        for (int i = 0; i < mid; i++) {
            LeftArr[i] = arr[i];
        }

        for (int i = mid; i < noOfElement; i++) {
            RightArr[i - mid] = arr[i];
        }

        mergeSort(LeftArr, LeftArr.length);
        mergeSort(RightArr, RightArr.length);

        merge(arr, LeftArr, RightArr);
    }

    static void merge(int[] arr, int[] LeftArr, int[] RightArr) {

        int i = 0, j = 0, k = 0;

        while (i < LeftArr.length && j < RightArr.length) {

            if (LeftArr[i] <= RightArr[j]) {
                arr[k++] = LeftArr[i++];
            } else {
                arr[k++] = RightArr[j++];
            }
        }

        while (i < LeftArr.length) {
            arr[k++] = LeftArr[i++];
        }

        while (j < RightArr.length) {
            arr[k++] = RightArr[j++];
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 50, 30, 20, 40};

        mergeSort(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }
}
