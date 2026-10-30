package Level2;

// Container With Most Water
public class _62Problem {

    public static void main(String[] args) {

        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int left =0,right =arr.length-1;
        int leftmax =0,rightmax=0;


        int water = 0;

        while(left<right){
           if(arr[left]<=arr[right]){
               if(arr[left]>=leftmax){
                   leftmax=arr[left];
               }
               else {
                   water+=leftmax-arr[left];
               }
               left++;
           }
           else {
               if(arr[right]>=rightmax){
                   rightmax=arr[right];

               }
               else {
                   water+=rightmax-arr[right];
               }
               right--;
           }
        }
        System.out.println(water);



    }
}