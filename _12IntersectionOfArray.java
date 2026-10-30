public class _12IntersectionOfArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 5, 6, 7};

        int[] ans = intersection(arr1, arr2);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }

    private static int[] intersection(int[] arr1, int[] arr2) {

        int[] ans = new int[Math.min(arr1.length, arr2.length)];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                i++;

            } else if (arr1[i] > arr2[j]) {
                j++;

            } else {

                if (k == 0 || ans[k - 1] != arr1[i]) {
                    ans[k] = arr1[i];
                    k++;
                }

                i++;
                j++;
            }
        }

        int[] result = new int[k];

        for (int x = 0; x < k; x++) {
            result[x] = ans[x];
        }

        return result;
    }
}