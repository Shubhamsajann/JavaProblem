package Book1;

import java.util.HashMap;
import java.util.Map;

public class _12MissingNumber {

    public static void main(String[] args) {

        int[] arr = {1,2, 3,5};

        int n = arr.length;
        int m = n+1;
        int total  = ((m)*(m+1)) / 2;
        int sum =0;


        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(total-sum);
        }


}

