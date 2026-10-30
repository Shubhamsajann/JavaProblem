
package Level1;

public class _32Problem {
    public static void main(String[] args) {

        int[] arr = {10, 15, 20, 7, 8, 12};


       int target  = 20;

int index =-1;

        for (int i=0;i<arr.length;i++) {

            if(arr[i] == target)  {
         index=i;
                break;
            }
        }

        System.out.println(index);

    }
}
