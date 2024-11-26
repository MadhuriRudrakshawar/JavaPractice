//import java.util.Stack;
//
//public class StackNextSmallNumber {
//
//    public static void main(String[] args) {
//        int arr[] = {4, 2, 1, 5, 3};
//        int ans[] = checkSmallNumber(arr);
//
//
//    }
//
//    static int[] checkSmallNumber(int[] arr) {
//
//        Stack stk = new Stack();
//
//        for (int i = 0; i < arr.length - 1; i++) {
//
//            if (arr[i] > arr[i + 1]) {
//                int diff = arr[i] - arr[i + 1];
//                stk.push(diff);
//            } else if (arr[i] < arr[i + 1]) {
//                stk.push(-1);
//            }
////            else if (stk.peek() == arr[]) {
////                stk.push(-1);
////            }
//        }
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            System.out.print( stk.pop(arr[i]) + ", " );
//        }
//
//        return arr;
//
//    }
//}