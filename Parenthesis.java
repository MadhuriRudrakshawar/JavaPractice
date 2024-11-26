import java.util.Stack;

public class Parenthesis {

    static boolean checkPara(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else {

                if (!st.empty() &&
                        (
                                (st.peek() == '(' && s.charAt(i) == ')' )||
                                (st.peek() == '{' && s.charAt(i) == '}') ||
                                (st.peek() == '[' && s.charAt(i)== ']')
                        )){

                    st.pop();
                }else{
                            return false;
                }
            }
        }
        return st.empty();
    }

    public static void main(String[] args) {
        String para = "({})";

        if (checkPara(para)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}


//public class Parenthesis {
//
//    final int max = 100;
//    String arr[] = new String[];
//    int top;
//
//    boolean isEmplty() {
//        return top < 0;
//    }
//
//    void push(String aaa) {
//
//        if (top > max - 1) {
//            System.out.println("stack full");
//        } else {
//            ++top;
//            arr[top] = aaa;
//          //  System.out.println(aaa + "pushed");
//        }
//    }
//
//
//    String pop(){
//        if(isEmplty()){
//            System.out.println("Stack Empty");
//        }else {
//            String temp = arr[top];
//            top--;
//
//        }
//    }
//
//    boolean checkParenthesis(){
//        if(String ){}
//    }
//
//    public static void main(String[] args) {
//
//
//        Parenthesis p = new Parenthesis();
//
//        p.push("[");
//        p.push("{");
//        p.push("(");
//
//        boolean check = checkParenthesis();
//
//    }
//}
