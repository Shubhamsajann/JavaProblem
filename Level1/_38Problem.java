
package Level1;

import java.util.HashSet;

//find duplicate element array
public class _38Problem {




    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 30};


        HashSet<Integer> set = new HashSet<>();
        for (int num : arr){
            if (set.contains(num)) {
                System.out.print("duplicated");
            }
        set.add(num);
    }




    }
}
