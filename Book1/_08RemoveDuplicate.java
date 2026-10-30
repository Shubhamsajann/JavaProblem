package Book1;

import java.util.LinkedHashSet;
import java.util.Set;

public class _08RemoveDuplicate {

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};


        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        for (int num : set) {
            System.out.print(num + " ");
        }
    }

}
