package Level4;

public class _85CountFrequency {

    public static void main(String[] args) {

        String str = "A man, a plan, a canal: Panama";

        countVowelConsonant(str);
    }


    public static void countVowelConsonant(String str){
int vowles = 0 ;
int consonant = 0;
        str = str.toLowerCase();
int[] freq = new int[256];
        for (int i = 0; i <str.length() ; i++) {


            char ch = str.charAt(i);
            if (!Character.isLetter(ch)) {
                continue;
            }

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                vowles++;
            } else {
                consonant++;
            }
        }

            System.out.println("Vowels: " + vowles);
            System.out.println("Consonants: " + consonant);

    }



    }
