package Important_Promnlems;

public class _4CheckArrraySorted {

    public static  boolean isSorted(int[] arr)
    {



        for (int i = 1; i <arr.length ; i++) {

            if(arr[i-1] > arr[i]) return false;

        }
        return true;

    }

    public static void main(String[] args) {
        int[] arr ={10,30,40,60,50};
        System.out.println(isSorted(arr));

    }
}
