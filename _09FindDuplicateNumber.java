public class _09FindDuplicateNumber {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7};

        int sum2= 0;
        int sum1=0;
        int n = arr.length + 1;
        for (int i = 0; i <arr.length; i++) {
            sum2+=arr[i];

        }
    sum1 = (n *(n+1))/2;

        System.out.println(sum1-sum2);


        int xor =0;
        for (int i = 0; i <=n ; i++) {
            xor^=i;

        }
        for (int x : arr) {

            xor ^= x;

        }
        System.out.println(xor);
    }





}
