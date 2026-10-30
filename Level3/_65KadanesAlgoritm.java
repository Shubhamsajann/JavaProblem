package Level3;

import java.util.ArrayList;
import java.util.HashMap;

public class _65KadanesAlgoritm {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 2, 1, 1, 1, 2};

     int  currsum = 0;
     int maxSum = Integer.MIN_VALUE;

        for (int x : arr){

         currsum=Math.max(currsum+x,x);

         maxSum = Math.max(maxSum,currsum);
        }
        System.out.println(maxSum);
    }
    }

