
package Level1;

//Floyd’s Cycle Detection algorithm
public class _47Problem {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2};

       int slow =0;
       int fast = 0;
       do{
           slow=arr[slow];
           fast=arr[arr[fast]];
       }
       while (slow!=fast);

       slow=0;

       while (slow!=fast){
           slow=arr[slow];
           fast=arr[fast];
       }
        System.out.println(slow);
    }
}
