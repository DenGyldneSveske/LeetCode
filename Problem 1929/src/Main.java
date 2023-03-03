public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] nums = {1, 2, 1};
        int[] ans = new int[nums.length * 2];

        Solution solution = new Solution();

        ans = solution.getConcatenation(nums);

        for (int num : ans) {
            System.out.println(num);
        }
    }
}