class Solution {
    public double myPow(double x, int n) {
        long exp = Math.abs((long) n);

        double res = 1.0;
        double base = x;
        while (exp > 0) {
            if ((exp & 1) == 1) res *= base;
            base *= base;
            exp >>= 1;
        }
        return n < 0 ? 1.0 / res : res;
    }
}