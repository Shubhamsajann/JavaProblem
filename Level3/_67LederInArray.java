package Level3;

public class _67LederInArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 2, 1, 1, 1, 2};

       int rightmax = arr[arr.length-1];
        System.out.print(rightmax+" ");

        for (int i=arr.length-2 ; i>=0;i--) {

           if(arr[i] > rightmax){
               System.out.println(arr[i]);
               rightmax=arr[i];
           }

        }


    }





    
}
