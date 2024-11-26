public class RaverseString {

    public static void main(String[] args) {

        String a = "abcdefg";

        String rev = printReverseString(a);
        System.out.println(rev);

    }

    public static String printReverseString(String a){

        StringBuilder reverse = new StringBuilder();

        for (int i = a.length()-1;  i >= 0  ; i--) {
            reverse.append(a.charAt(i));

        }

        return reverse.toString();
    }
}
