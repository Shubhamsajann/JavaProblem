package Important_Problems.Revise;

public class _02MinSizeSUbarray {


    static  int minSize(int[] arr,int target){

        int minsize =Integer.MAX_VALUE;
        int left =0;
        int sum =0;

        for (int right  = 0; right  <arr.length ; right ++) {

            sum+=arr[right];

            while (sum>= target){
                minsize=Math.min(minsize,right-left+1);
                sum=sum-arr[left];
                left++;
            }
        }
        return minsize;
    }
    public static void main(String[] args) {


        int[] arr = {10,20,30,10,40,50};
        int target =90;
        System.out.println( minSize(arr,target));

    }
}
