package Level6;

public class _135SumOfArray {

    public static int sumOfArray(int[] arr, int index) {

        if(index == arr.length-1) return 0;

        return arr[index]+sumOfArray(arr,index+1);

    }

    public static void main(String[] args) {

        int[] arr = {10,20,40,50,60,};

        int s  = sumOfArray(arr,0);
        System.out.println(s);
    }


}


