package Level3;

import java.util.ArrayList;
import java.util.HashSet;

public class _72Disappered {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 4, 5};

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> missing = new ArrayList<>();


        for (int num : arr) {
            set.add(num);

        }


        for (int i = 1; i <= arr.length; i++) {

            if(!set.contains(i)){
                missing.add(i);
            }
        }
        System.out.println(missing);
    }



    }
