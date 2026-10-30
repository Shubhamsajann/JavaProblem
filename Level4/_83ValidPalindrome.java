package Level4;

public class _83ValidPalindrome {

    public static void main(String[] args) {

        String str = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(str));
    }


    public static boolean isPalindrome(String str){

int l =0 ,r = str.length()-1;
boolean pali = true;

while (l<r){
 while (l<r && !Character.isLetterOrDigit(str.charAt(l))) l++;
 while (l<r && !Character.isLetterOrDigit(str.charAt(r))) r--;


    if (Character.toLowerCase(str.charAt(l)) !=
            Character.toLowerCase(str.charAt(r))) {
        return false;
    }

 l++;
 r--;
}

return true;

    }



    }
