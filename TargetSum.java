//Given a list of integers and a target sum, write a function that returns all unique pairs of numbers that add up to the target."

public class TargetSum {

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {


                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};

    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int target = 5;

        int[] ans = twoSum(nums, target);

        System.out.println("numbers are : " + ans);
    }

}