package Exception;

public class Exception12 {

    public static void main(String[] args) {
        try {

            String name = "abc";

            if(!name.matches("-?\\d+")){
                throw new NumberFormatException("Invalid number format");
            }
            int n = Integer.parseInt(name);
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("Invalid format");
        }
        System.out.println("program executed");
    }
}
