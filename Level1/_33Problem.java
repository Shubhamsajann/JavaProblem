
package Level1;

public class _33Problem {
    public static void main(String[] args) {

        int[] arr = {10, 20,30};
boolean sorted = true;


        for (int i=1;i<arr.length;i++) {

            if(arr[i] < arr[i-1])  {
sorted=false;
                break;
            }
        }
if(sorted)
        System.out.println("sorted");
else System.out.println("not Sorted");

    }
}
