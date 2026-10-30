
package Book1;

import java.util.HashMap;

public class _20SubArraySUmEqualK {

    public static void main(String[] args) {
int[] arr = {1,2,3,4,5,6};
int k=5;

        System.out.println(subSum(arr,k));

    }

    public static int subSum(int[] arr,int k) {

        HashMap<Integer,Integer> map =new HashMap<>();
map.put(0,1);

int sum =0;
int count =0;

    for (int  x  : arr){
        sum+=x;
        if(map.containsKey(sum-k)){
        count+=map.get(sum-k);
        }
        map.put(sum,map.getOrDefault(sum,0)+1);

    }
   return count;
    }


}
