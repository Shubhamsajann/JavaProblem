
package Level1;

public class _31Problem {
    public static void main(String[] args) {

        int[] arr = {10, 15, 20, 7, 8, 12};


       int target  = 210;

       boolean found = false;

        for (int num : arr) {

            if(num == target)  {
                found = true;
                break;
            }
        }

        System.out.println(found);

    }
}
