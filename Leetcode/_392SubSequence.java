package Leetcode;

public class _392SubSequence {
    public static Boolean isSubSequence(String s,String t) {
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        int i=0 , j= 0;


        while(i<c1.length && j<c2.length) {
            if(c1[i] == c2[j]) {
                i++;
            }
            j++;
        }
        return i==s.length();

    }

    public static void main(String[] args) {

        String s = "abcd";
        String t = "abcde";
        System.out.print(isSubSequence(s,t));
    }


}
