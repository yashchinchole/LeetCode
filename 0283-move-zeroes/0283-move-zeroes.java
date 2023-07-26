class Solution {
    public void moveZeroes(int[] nums) {

        int nonZero = 0;
        for (int num : nums)
            if (num != 0)
                nums[nonZero++] = num;
        while (nonZero < nums.length)
            nums[nonZero++] = 0;

        // int zeroCount = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == 0)
        //         zeroCount++;
        //     else if (zeroCount > 0) {
        //         nums[i - zeroCount] = nums[i];
        //         nums[i] = 0;
        //     }
        // }

    }
}