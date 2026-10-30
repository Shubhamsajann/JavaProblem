package Level3;

import java.util.ArrayList;
import java.util.HashSet;

public class _71FindAllDuplicate {

    public static void main(String[] args) {

        int[] arr = {1,2,2,4,5};

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> duplicate = new ArrayList<>();


        for (int num : arr){
            if(set.contains(num)){
                duplicate.add(num);
            }
            else set.add(num);
        }

        System.out.println(duplicate);
    }
}