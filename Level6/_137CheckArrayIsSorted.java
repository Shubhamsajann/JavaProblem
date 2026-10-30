package Level6;

public class _137CheckArrayIsSorted {

    public static boolean isSorted(int[] arr, int index) {

        if(index == arr.length-1) return true;

if(arr[index]>arr[index+1]) return false;
return isSorted(arr,index+1);


    }

    public static void main(String[] args) {

        int[] arr = {10,20,40,50,60,};

        boolean s  = isSorted(arr,0);
        System.out.println(s);
    }



}


