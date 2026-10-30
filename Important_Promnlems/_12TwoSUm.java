package Important_Promnlems;

import java.util.HashMap;

public class _12TwoSUm {

    public static int[] twoSum(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int needed = target-arr[i];

            if(map.containsKey(needed)){

                return new int[] {map.get(needed),i};
            }
            map.put(arr[i],i);
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {10,20,40,30};
        int target =50;
    int[] ans = twoSum(arr,target);
    for (int x :ans){
        System.out.print(x+" ");
    }
    }
}
