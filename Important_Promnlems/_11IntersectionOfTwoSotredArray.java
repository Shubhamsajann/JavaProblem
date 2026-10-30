package Important_Promnlems;

import java.util.Arrays;

public class _11IntersectionOfTwoSotredArray {

    public static int[] intersection(int[] arr1, int[] arr2) {

        int[] ans = new int[Math.min(arr1.length, arr2.length)];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                i++;

            } else if (arr1[i] > arr2[j]) {
                j++;

            } else {

                // Both elements are equal
                if (k == 0 || ans[k - 1] != arr1[i]) {
                    ans[k++] = arr1[i];
                }

                i++;
                j++;
            }
        }

        return Arrays.copyOf(ans, k);
    }

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40, 50, 60};
        int[] arr2 = {5, 10, 15, 20, 25};

        int[] ans = intersection(arr1, arr2);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}