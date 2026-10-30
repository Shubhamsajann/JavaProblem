package Level2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// pair with given sum
public class _57Problem {

    public static void main(String[] args) {

        int[] arr1 = {1, 4, 5};
        int target = 6;

        HashSet<Integer> set =new HashSet<>();

        for (int num : arr1) {
            int needed  = target -num;

            if(set.contains(needed)){
                System.out.println(needed+" "+num+" "+target);
            }
            set.add(num);

        }

    }
}
