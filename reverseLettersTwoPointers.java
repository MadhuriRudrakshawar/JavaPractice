import java.util.*;

public class reverseLettersTwoPointers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String s = sc.next();

    //    String s ="abcd";
        String ans = reverseLetters(s);
        System.out.println(ans);
    }

    private static String reverseLetters(String s) {

        StringBuilder sb = new StringBuilder(s);
        int left = 0;
        int right = s.length()-1;


        while(left < right){

            if(Character.isLetter(sb.charAt(left)) && Character.isLetter(sb.charAt(right)) ){

                char temp = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);

                left++;
                right--;
            }else if(!(Character.isLetter(sb.charAt(left)))){
                left++;
            }else if(!(Character.isLetter(sb.charAt(right)))){
                right--;
            }
        }

        return sb.toString();
    }


}
