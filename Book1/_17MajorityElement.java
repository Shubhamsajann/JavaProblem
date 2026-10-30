
package Book1;

import java.util.Arrays;

public class _17MajorityElement {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30,30,30, 40,40,40,40,40};

        System.out.println(majority(arr));

    }

    public static int majority(int[] arr) {

       int majority =0;

       int count =0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == majority){
                count++;
            }
            else if(count==0){
                majority=arr[i];
                count=1;

            }
            else {
                count--;
            }
        }
        return majority;

    }


}
