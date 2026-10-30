package Level3;

import java.util.ArrayList;
import java.util.HashMap;

public class _64MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 2, 1, 1, 1, 2};

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }

        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int x : map.keySet()){
            if(map.get(x)>(arr.length/3)){
                list.add(x);
            }
        }
        System.out.println(list);
    }
    }

