class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0], max = nums[0];
        for (int n : nums) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        return gcd(max, min);
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}