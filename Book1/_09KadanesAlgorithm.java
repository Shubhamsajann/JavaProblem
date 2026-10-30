package Book1;

import java.util.LinkedHashSet;
import java.util.Set;

public class _09KadanesAlgorithm {

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int currentsum = arr[0];
        int maxsum = arr[0];

        for (int i = 0; i <arr.length ; i++) {

            currentsum =Math.max(arr[i],currentsum+arr[i]);
            maxsum = Math.max(currentsum,maxsum);
        }
        System.out.println("Maximum subarray sum: " + maxsum);



    }

}
