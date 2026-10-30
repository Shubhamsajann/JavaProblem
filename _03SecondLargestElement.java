public class _03SecondLargestElement {


    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60};
    int ans = secondLargest(arr);
        System.out.println(ans);

    }

    private static int secondLargest(int[] arr) {
        int a = Integer.MIN_VALUE;
        int b  = Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++){
            if(arr[i]> a ){
                b=a;
                a=arr[i];
            } else if (arr[i] > b && arr[i]!=a) {
                b=arr[i];

            }
        }
        return b;
    }

}
