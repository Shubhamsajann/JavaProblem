
package Level6;

public class _140GenerateAllSubSequence {

    public static void   printSubsequence(String s ,int index,String current){


        if(index == s.length() ) {
            System.out.println(current);
            return;
        }

        printSubsequence(s,index+1,current+s.charAt(index));
        printSubsequence(s,index+1,current);
    }
    public static void main(String[] args) {
        String s =  "abc";
        printSubsequence(s , 0,"");
    }

}






