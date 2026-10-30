package Important_Promnlems;

public class _2LargestElement {

    public static  int largest(int[] arr)
    {

        int max = arr[0];

        for (int i = 1; i <arr.length ; i++) {

            if(arr[i] > max) max= arr[i];

        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr ={10,30,40,50,60};
        System.out.println(largest(arr));

    }
}
