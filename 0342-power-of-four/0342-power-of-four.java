class Solution {
    public boolean isPowerOfFour(int n) {

        // if (n == 1)
        // return true;
        // if (n % 4 != 0 || n < 0)
        // return false;
        // return isPowerOfFour(n / 4);

        return n > 0 && (n & (n - 1)) == 0 && (n - 1) % 3 == 0;
    }
}