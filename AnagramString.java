import java.util.HashMap;
import java.util.HashSet;

public class AnagramString {

    public static void main(String[] args) {

        String s = "jam";
        String t = "jrty";

        boolean ans = isAnagram(s, t);
        System.out.println(ans);
    }

    public static boolean isAnagram(String s, String t) {
        {
            HashSet<Character> set = new HashSet();

            for (int i = 0; i < s.length(); i++) {
                set.add(s.charAt(i));
            }

            for (int k = 0; k < t.length(); k++) {
                set.add(s.charAt(k));
            }
            for (int j = 0; j < t.length(); j++) {
                if (set.contains(t.charAt(j))) {
                    set.remove(s.charAt(j));
                }
            }

            if (set.isEmpty()) {
                return true;
            } else {
                return false;
            }
        }
    }
}
