
package Level6;

public class _141GenerateArraySubSet {

    public static void   findSubset(int[] arr  ,int index, String current){


        if(index == arr.length ) {
            System.out.println(current);
            return;
        }

        findSubset(arr,index+1,current+arr[index]);
        findSubset(arr,index+1,current);
    }
    public static void main(String[] args) {
    int[] arr = {1,2};
findSubset(arr,0,"");
    }

}






