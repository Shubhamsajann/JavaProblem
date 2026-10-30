package Level5;

import java.util.HashMap;
import java.util.Map;

public class _106CountFrequency {


    public static void main(String[] args) {


        int[] arr  = {10,20,30,40,10,20,40,50,60};
        HashMap<Integer,Integer> map  = new HashMap<>();

        for (int i  : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

      for (Map.Entry<Integer,Integer> entry  : map.entrySet()){
          System.out.println(entry.getKey()+" "+entry.getValue());
      }
    }

}
