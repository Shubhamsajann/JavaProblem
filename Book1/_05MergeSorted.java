

package Book1;

import java.util.Arrays;

public class _05MergeSorted {


    public static void merge(int[] arr  , int  low ,int mid , int high) {

        int[] temp = new int[high - low + 1];

        int i=low;
        int j=mid+1;
        int k=0;

        while (i<=mid && j<=high ){
            if(arr[i] < arr[j]){
                temp[k++]=arr[i++];
            }
            else {
                temp[k++] =arr[j++];
            }
        }

        while (i<=mid ){
            temp[k++] = arr[i++];
        }
        while (j<=high){
            temp[k++] =arr[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            arr[low + x] = temp[x];
        }

    }

    public void mergeSort(int[] arr , int low ,int high){
        if(low>=high){
            return;
        }

        int mid  =low + (high-low)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }


    public static void main(String[] args) {
        int[] arr ={10,20,30,50,15,40};


        for (int i = 0; i < arr.length-1 ; i++) {
            int minIndex = i;

            for (int j = i+1; j <arr.length; j++) {
                if(arr[j] < arr[minIndex]){

                    minIndex = j;
                }

            }
            int temp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}
