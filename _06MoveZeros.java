public class _06MoveZeros {


    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        moveZeros(arr);

        for (int x : arr) {

            System.out.print(x + " ");

        }

    }

    private static void moveZeros(int[] arr) {
        int k =0;

        for (int i = 0; i <arr.length; i++) {
            if(arr[i]!=0){
                int temp = arr[k];
                arr[k]=arr[i];
                arr[i]=temp;
                k++;
            }
            
        }
    }
}
