public class _11UnionofTwoSortedArrays {


    public static void main(String[] args) {

        int[] arr1 = {1, 3, 4};
        int[] arr2 = {1,2,3,4,5};



        int[] ans = union(arr1, arr2);



        for (int i = 0; i < ans.length; i++) {

            System.out.print(ans[i] + " ");

        }

    }

    private static int[] union(int[] arr1,int[] arr2) {
        int[] ans = new int[arr1.length + arr2.length];

        int i = 0;

        int j = 0;

        int k = 0;

        while(i<arr1.length && j<arr2.length){

            int value;

            if(arr1[i]<arr2[j]){
                value = arr1[i];
                i++;

            }
            else if(arr1[i]>arr2[j]){
                value = arr2[j];
                j++;
            }
            else {

                value = arr1[i];

                i++;

                j++;

            }
            if (k == 0 || ans[k - 1] != value) {

                ans[k] = value;

                k++;

            }

        }

        // Remaining elements of arr1

        while (i < arr1.length) {

            if (k == 0 || ans[k - 1] != arr1[i]) {

                ans[k] = arr1[i];

                k++;

            }

            i++;

        }

        // Remaining elements of arr2

        while (j < arr2.length) {

            if (k == 0 || ans[k - 1] != arr2[j]) {

                ans[k] = arr2[j];

                k++;

            }

            j++;

        }
        int[] result = new int[k];

        for (int x = 0; x < k; x++) {

            result[x] = ans[x];

        }

        return result;

    }

}