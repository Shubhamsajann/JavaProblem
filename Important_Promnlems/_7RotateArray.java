package Important_Promnlems;

public class _7RotateArray {

    public static  void rotate(int[] arr,int k)
    {

        k = k% arr.length;

        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);

    }
    public static void reverse(int[] arr,int left,int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr ={10,30,40,60,50};
      rotate(arr,3);
      for(int i : arr){
          System.out.print(i + " ");
      }

    }
}
