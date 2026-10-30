import java.util.Arrays;

public class _17MergeTwoSortedArray {
    public static int[] merge(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] <= second[j]) {
                merged[k++] = first[i++];
            } else {
                merged[k++] = second[j++];
            }
        }

        while (i < first.length) merged[k++] = first[i++];
        while (j < second.length) merged[k++] = second[j++];
        return merged;
    }

    public static void main(String[] args) {
        int[] first = {1, 3, 5, 7};
        int[] second = {2, 4, 6, 8};
        System.out.println(Arrays.toString(merge(first, second)));
    }
}