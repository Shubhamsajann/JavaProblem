
package Book1;

import java.util.Arrays;

public class _13ReverseString {

    public static void main(String[] args) {

   String s = "hello";


   char[] arr = s.toCharArray();

   int i=0;
   int j=arr.length-1;

   while (i<j){
       char  c = arr[i];
       arr[i]=arr[j];
       arr[j]=c;
       i++;
       j--;
   }



        System.out.println(new String(arr));
        }


}

