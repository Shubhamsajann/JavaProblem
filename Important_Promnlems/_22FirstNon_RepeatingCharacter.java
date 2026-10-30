package Important_Promnlems;

public class _22FirstNon_RepeatingCharacter {
    
    
    public static void main(String[] args) {

       String str = "abcab";


        System.out.println(NonReapting(str));
    }

    private static char NonReapting(String str) {

        java.util.HashMap<Character, Integer> map =
                new java.util.HashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return '\0';

    }
}
