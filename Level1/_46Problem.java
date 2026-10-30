
package Level1;

//Rotate by k
public class _46Problem {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int k=1;
        k=k%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);


        for (int num : arr) {
            System.out.print(num+" ");
            }

        }


public  static void reverse(int[] arr, int l,int r){
        while (l<r){
            int temp = arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }



    }
}
