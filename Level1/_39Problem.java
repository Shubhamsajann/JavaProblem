
package Level1;

import java.util.HashMap;
import java.util.HashSet;

//find duplicate element array
public class _39Problem {




    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 30};


        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
            }

    for(int num : arr){

        if(map.get(num)==1) System.out.print(num+" ");
    }





    }
}
