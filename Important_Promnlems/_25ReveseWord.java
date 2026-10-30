package Important_Promnlems;

public class _25ReveseWord {
    public static void main(String[] args) {
        String str = "shr";

        System.out.println(reverse(str));

    }
    public static  String reverse(String str){
       String[] words = str.trim().split("\\s+");
       StringBuilder br = new StringBuilder();
        for (int i = words.length-1; i >=0; i--) {
            br.append(words[i]);

            if(i!=0){
                br.append(" ");

            }


        }
        return br.toString();

    }
}





