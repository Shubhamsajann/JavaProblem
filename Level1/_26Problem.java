
package Level1;

public class _26Problem {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,};

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;


        for (int num: arr) {

       if(num < min1){
           min2=min1;
           min1=num;
       }
       else if(num<min2 && num !=min1){
           min2=num;
       }


        }

        System.out.println(min1);
        System.out.println(min2);

    }
}
