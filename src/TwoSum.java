import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = { 2, 7, 11, 15, 3, 6 };
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result)); // [0, 1]

    // Brute force approach: check every pair
    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
}
