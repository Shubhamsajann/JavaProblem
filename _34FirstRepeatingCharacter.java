import java.util.HashSet;

public class _34FirstRepeatingCharacter {

    private static char firstRepeating(String str) {

        HashSet<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {

            if (set.contains(ch)) {
                return ch;
            }

            set.add(ch);
        }

        return '\0';
    }

    public static void main(String[] args) {

        String str = "swiss";

        System.out.println(firstRepeating(str));
    }
}