public class _25ReverseWords {
    public static void main(String[] args) {

        String str = "iam is iam";

        System.out.println(reverseword(str));
    }

    private static String reverseword(String str) {

        String[] words = str.trim().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (int i = words.length-1; i >=0 ; i--) {

            result.append(words[i]);

            if(i != 0){
                result.append(" ");

            }


        }
        return result.toString();
    }



}
