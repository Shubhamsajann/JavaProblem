
package Level5;

import java.util.HashSet;

public class _125ongestSubArraySumEqualK {



        public static void main (String[]args){
         int n = 19;

            System.out.println(happyNumber(n));



    }

    private static boolean happyNumber(int n) {

        HashSet<Integer> seen = new HashSet<>();

        while (n!=1){

            if(seen.contains(n)){
                return false;

            }
            seen.add(n);

            int sum  = 0;

            while (n>0){
                int digit = n%10;
                sum+=digit*digit;
                n=n/10;
            }
            n = sum;
        }
        return true;

    }
}