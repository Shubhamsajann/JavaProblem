package Important_Promnlems;

public class _8MissingNumber {


    public static int missingNumber(int[] arr){
      int n =arr.length+1;
      int xor =0;
        for (int i = 1; i <=n; i++) {

            xor^=i;
        }

        for (int x : arr) {
            xor ^=x;

        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,5,6,7,8};
        System.out.println(missingNumber(arr));


    }
}
