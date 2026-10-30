import java.util.HashMap;

public class _22FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        String str = "swiss";

        System.out.println(firstNonRepeating(str));
    }

    private static char firstNonRepeating(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }

        }

        return '\0';
    }



}
