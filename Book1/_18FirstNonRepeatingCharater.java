
package Book1;

import java.util.HashMap;

public class _18FirstNonRepeatingCharater {

    public static void main(String[] args) {

        int[] arr = {10,10,10, 20, 30,30,30, 40,40,40,40,40};

        System.out.println(nonrep(arr));

    }

    public static int nonrep(int[] arr) {

        HashMap<Integer,Integer> map =new HashMap<>();

        for (int x : arr){

            map.put(x,map.getOrDefault(x,0)+1);
        }
        for (int num : arr){
            if(map.get(num)==1){
                return num;
            }
        }
return -1;

    }


}
