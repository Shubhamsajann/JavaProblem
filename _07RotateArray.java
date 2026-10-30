public class _07RotateArray {

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
int k=3;
        rotate(arr,k);
        for (int x : arr) {

            System.out.print(x + " ");

        }
    }

    private static void rotate(int arr[], int k){
        k = k % arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
    }
    private static void reverse(int arr[], int i,int j) {


        while (i < j) {

            int temp = arr[i];

            arr[i] = arr[j];

            arr[j] = temp;

            i++;

            j--;

        }

    }

}
