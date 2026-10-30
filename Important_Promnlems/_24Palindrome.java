package Important_Promnlems;

public class _24Palindrome {
    public static void main(String[] args) {
        String str = "shrhs";

        System.out.println(palindrome(str));

    }
    public static  boolean palindrome(String str){
        int left =0;
        int right = str.length()-1;

        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;


        }
        return true;
    }
}
