
package Level1;
//reverse array
public class _34Problem {
    public static void main(String[] args) {

        int[] arr = {10, 20,30};

        int left =0;
        int right =arr.length-1;


while(left<right){
    int temp = arr[left];
    arr[left]=arr[right];
    arr[right]=temp;
    left++;
    right--;
}

for(int num : arr){
    System.out.print(num+" ");
}
    }
}
