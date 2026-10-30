package Book1;

import java.util.Arrays;

public class _23MergeSortedArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5,5, 6};
        int[] arr2 = {5,6,7,8,10,20,30,40,50,60};

        System.out.println(Arrays.toString(merge(arr1,arr2)));


    }

    public static int[] merge(int[] arr1,int[] arr2) {

int i=0;int j=0;int k=0;


int[] res = new int[arr1.length+arr2.length];

while (i<arr1.length && j<arr2.length){
    if(arr1[i]<arr2[j]){
        res[k++]=arr1[i++];
    }
    else{
        res[k++]=arr2[j++];
    }
}

while (i<arr1.length){
    res[k++]=arr1[i++];
}
        while (j<arr2.length){
            res[k++]=arr2[j++];
        }

        return res;

    }
}
