class Solution {
    public boolean isPowerOfThree(int n) {

        // if (n == 1)
        // return true;
        // if (n < 1 || n % 3 != 0)
        // return false;
        // return isPowerOfThree(n / 3);

        // return (Math.log10(n) / Math.log10(3)) % 1 == 0;

        return (n > 0 && 1162261467 % n == 0);
    }
}