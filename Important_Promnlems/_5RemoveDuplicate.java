package Important_Promnlems;

public class _5RemoveDuplicate {

    public static  int removeDuplicates(int[] arr)
    {


        int k=1;
        for (int i = 1; i <arr.length ; i++) {

            if(arr[i-1] != arr[i]){
                arr[k] = arr[i];
                k++;
            }

        }
        return k;

    }

    public static void main(String[] args) {
        int[] arr ={10,30,40,60,50};
        System.out.println(removeDuplicates(arr));

    }
}
