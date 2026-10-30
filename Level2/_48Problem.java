package Level2;

//Two Sum using two pointer
public class _48Problem {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2};
        int target =6;

        int l=0;
        int r=arr.length-1;

        while (l<r){
            int sum = arr[l]+arr[r];
            if(sum == target) {
                System.out.println(target);
                break;
            }

            else if (sum < target) {
                l++;

            }
            else {
                r--;
            }
        }
    }
}
