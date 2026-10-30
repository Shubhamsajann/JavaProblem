
package Book1;

import java.util.Arrays;
import java.util.HashMap;

public class _21TwoSUm {

    public static void main(String[] args) {
int[] arr = {1,2,3,4,5,6};
int k=5;

int[] a = subSum(arr,k);
        System.out.println(Arrays.toString(a));

    }

    public static int[] subSum(int[] arr, int target) {

        HashMap<Integer,Integer> map =new HashMap<>();



    for (int i=0;i<arr.length;i++){
int find = target - arr[i];

if(map.containsKey(find)){

    return new int[] { map.get(find),i };

        }



        map.put(arr[i],i);

    }
   return new int[]{-1,-1};
    }


}
