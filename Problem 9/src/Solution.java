public class Solution {
    public boolean isPalindrome(int x) {
        return x == reverse(x);
    }

    private int reverse(int x) {
        int reversed = 0;

        if (x < 0) {
            return 0;
        }

        while (x != 0) {
            int number = x % 10;
            reversed = reversed * 10 + number;
            x /= 10;
        }

        return reversed;
    }
}
