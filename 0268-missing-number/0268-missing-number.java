class Solution {
    public int missingNumber(int[] nums) {
        int obtainSum = 0;
        for (int i = 0; i < nums.length; i++)
            obtainSum += nums[i];
        return ((nums.length) * (nums.length + 1) / 2) - obtainSum;
    }
}