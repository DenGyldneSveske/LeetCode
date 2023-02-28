public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] nums = {1, 2, 3, 4};

        Solution solution = new Solution();

        nums = solution.runningSum(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}


/*
1480. Running Sum of 1d Array

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.
* */