public class Solution {
    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (leftSum(nums, i) == rightSum(nums, i)) {
                return i;
            }
            else if (leftSum(nums, i) == 0 && rightSum(nums, i) == 0) {
                return 0;
            }
        }
        return -1;
    }

    private int leftSum(int[] nums, int index) {
        int sum = 0;
        if (index > 0) {
            for (int i = 0; i < index; i++) {
                sum += nums[i];
            }
            return sum;
        }
        return 0;
    }

    private int rightSum(int[] nums, int index) {
        int sum = 0;
        if (index < nums.length) {
            for (int i = index + 1; i < nums.length; i++) {
                sum += nums[i];
            }
            return sum;
        }
        return 0;
    }
}
