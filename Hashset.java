//Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

import java.util.Iterator;
import java.util.*;

public class Hashset<I extends Number> {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 5, 6, 7};

        boolean ans = checkArrayDuplicates(arr);

        System.out.println(ans);
    }

    private static boolean checkArrayDuplicates(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        int n = arr.length;

//        Iterator<Integer> it : new Iterator<>() {
//
//            if(it.hasNext()){
//                System.out.println(it);
//            }

        for (int i = 0; i < n; i++) {

            if (set.contains(arr[i])) {
                return true;
            } else {
                set.add(arr[i]);
            }
        }
        return false;

    }
}