package Level4;

import java.util.Arrays;

public class _82ReverseString {

    public static void main(String[] args) {

String str = "shubham";
        char[] arr = str.toCharArray();
int l =0 ,r = str.length()-1;
while (l<r){
    char temp = arr[l];
    arr[l] = arr[r];
    arr[r] = temp;
    l++;
    r--;


}


        System.out.println(arr);
        System.out.println(new String(arr));

    }



    }
