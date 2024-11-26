import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

      //  String s = "abcde";
        String ans = reverseString(s);

        System.out.println(ans);
    }

    static String reverseString(String s) {

        StringBuilder str = new StringBuilder();
     //   char space = ' ';

        for (int i = s.length() - 1; i >= 0; i--) {
            str.append(s.charAt(i));
        }

        return str.toString();

    }
}
