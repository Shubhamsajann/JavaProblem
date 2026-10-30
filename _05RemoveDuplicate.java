public class _05RemoveDuplicate {

    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60};
        int k = removeDuplicates(arr);

        System.out.println("Unique elements: " + k);

        for (int i = 0; i < k; i++) {

            System.out.print(arr[i] + " ");

        }

    }
    private static int removeDuplicates(int[] arr) {



        int k = 1;
        for (int i = 1; i < arr.length; i++) {
 if(arr[i]!=arr[i-1]){
     arr[k]=arr[i];
     k++;
 }


        }
return k;
    }

}
