public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] nums = {3, 3};
        int target = 6;
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);

        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }



}