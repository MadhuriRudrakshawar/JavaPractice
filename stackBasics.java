//public class stackBasics {
//
//    final int max = 1000;
//    int top;
//    int arr[] = new int[max];
//
//    boolean isEmpty() {
//        return top < 0;
//    }
//
//    void Stack() {
//        top = -1;
//    }
//
//     boolean push(int x) {
//        if (top > max - 1) {
//            System.out.println("stack is empty");
//            return false;
//        } else {
//            arr[++top] = x;
//            System.out.println(x + "pushed");
//            return true;
//        }
//    }
//
//    int pop(){
//        if(top < 0){
//            System.out.println("stack empty");
//            return 0;
//        }else{
//            int x = arr[top--];
//            return x;
//        }
//    }
//
//    int peek(){
//        if(top < 0 ){
//            System.out.println("stack empty");
//            return 0;
//        }else{
//            int x= arr[top];
//            return x;
//        }
//    }
//
//    void printa() {
//        for (int i = top; i > -1; i--) {
//            System.out.print(" " + arr[i]);
//        }
//    }
//
//
//    int sort(){
//
//        int tempStack[] = new int[arr.length];
//        while(!isEmpty()){
//
//            int temp = s.pop();
//
//            while(!isEmpty()){
//                if(!isEmpty() && tempStack.peek() > temp ){
//
//                }
//            }
//
//
//
//        }
//    }
//        public static void main(String[] args) {
//        stackBasics s = new stackBasics();
//        s.push(55);
//        s.push(10);
//        s.push(1);
//        s.push(20);
//
//       int rrr=  s.pop();
//            System.out.println(rrr);
//
//        int sss = s.peek();
//            System.out.println(sss);
//
//            s.sort();
//
//        s.printa();
//    }
//}
