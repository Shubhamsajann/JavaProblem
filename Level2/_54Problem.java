package Level2;

// Merge Sorted Arrays
public class _54Problem {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        // Compare both arrays
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        // Remaining elements of arr1
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        // Remaining elements of arr2
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        // Print result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}