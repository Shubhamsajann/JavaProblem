package Important_Promnlems;

public class _23Anagram {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "efgh";
        System.out.println(isAnagram(s1,s2));


    }

    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < str1.length(); i++) {

            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }

        for (int x : count) {
            if (x != 0) {
                return false;
            }
        }

        return true;
    }
}
