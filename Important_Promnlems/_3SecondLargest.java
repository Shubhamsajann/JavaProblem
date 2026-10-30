package Important_Promnlems;

public class _3SecondLargest {

    public static  int largest(int[] arr)
    {

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;


        for (int i = 1; i <arr.length ; i++) {

            if(arr[i] > max){
                max2=max;
                max=arr[i];
            }
            else if(arr[i]>max2 && arr[i]!=max){
                max2=arr[i];
            }

        }
        return max2;

    }

    public static void main(String[] args) {
        int[] arr ={10,30,40,50,60};
        System.out.println(largest(arr));

    }
}
