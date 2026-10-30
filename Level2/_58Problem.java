package Level2;

import java.util.HashSet;

// pair with given sum
public class _58Problem {

    public static void main(String[] args) {

        int[] arr1 = {1, 4, 5};
        int k = 2;

        HashSet<Integer> set =new HashSet<>();

        for (int num : arr1) {


            if(set.contains(num-k)){
                System.out.println(num-k+" "+num);
            }
            set.add(num);

        }
    
    }
}
