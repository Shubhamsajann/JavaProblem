package Level6;

public class _136FindMaxElement {

    public static int findMaxArray(int[] arr, int index) {

        if(index == arr.length-1) return arr[index];

int max = findMaxArray(arr,index+1);
return Math.max(arr[index],max);



    }

    public static void main(String[] args) {

        int[] arr = {10,20,40,50,60,};

        int s  = findMaxArray(arr,0);
        System.out.println(s);
    }



}


