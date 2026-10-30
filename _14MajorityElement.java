import java.util.HashMap;

public class _14MajorityElement {

    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 1, 1};

        int ans = majorityElement(arr);

        System.out.println(ans);
    }

    private static int majorityElement(int[] arr) {

        int candidate =0;
        int count =0;


        for (int i = 0; i <arr.length ; i++) {

            if(count == 0){
                candidate = arr[i];
        }
            if(arr[i] == candidate){
                count++;
            }
            else {
                count--;
            }

    }
        return candidate;

}
}