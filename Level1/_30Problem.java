
package Level1;

public class _30Problem {
    public static void main(String[] args) {

        int[] arr = {10, 15, 20, 7, 8, 12};

       int count =0;
       int target  = 20;


        for (int num : arr) {

            if(num == target) count++;
        }

        System.out.println(target+" "+count);

    }
}
