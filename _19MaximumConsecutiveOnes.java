public class _19MaximumConsecutiveOnes {


    public static void main(String[] args) {

        int[] arr = {1,2,1,1,1,5};

        System.out.println(maxCount(arr));
    }
    private  static int maxCount(int[] arr)
    {
        int maxcount=0;
        int currentcount =0;

        for(int x : arr){

            if(x == 1){
                currentcount++;
                maxcount = Math.max(currentcount,maxcount);

            }
            else {
                currentcount=0;
            }
        }
        return maxcount;
    }
}
