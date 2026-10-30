package Important_Promnlems;

public class _10UnionOfTwoSortedArray {


    public static int[] union(int[] arr1 , int[] arr2)
    {
        int[] ans = new int[arr1.length+arr2.length];

        int i=0;int j=0; int k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                if(k==0|| ans[k-1]!=arr1[i]){
                    ans[k++] =arr1[i];
                }
                i++;
            } else if (arr2[j]<arr1[i]) {
                if(k==0 || ans[k-1] != arr2[j]){
                    ans[k++]=arr2[j];
                }
                j++;

            }
            else{
                if(k==0 || ans[k-1]!=arr1[i]){
                    ans[k++]=arr1[i];
                }
                i++;
                j++;
            }
        }
        while(j<arr2.length){
            if(k==0 || ans[k-1]!= arr2[j]){
                ans[k++]=arr2[j];
            }
            j++;
        }
        while (i < arr1.length) {

            if (k == 0 || ans[k - 1] != arr1[i]) {
                ans[k++] = arr1[i];
            }
            i++;
        }
        return java.util.Arrays.copyOf(ans,k);
    }
    public static void main(String[] args) {

        int[] arr1 = {10,20,30,40,50,60};
        int[] arr2 ={5,10,15,20,25};
     int[] ans =   union(arr1,arr2);
        for (int x :ans ){







            System.out.print(x+" ");
        }
    }
}
