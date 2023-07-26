class Solution {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] == nums[i + 1])
                return true;
        return false;

        // Map<Integer, Integer> map = new HashMap<>();
        // for (int num : nums)
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // for (Map.Entry<Integer, Integer> entry : map.entrySet())
        //     if (entry.getValue() > 1)
        //         return true;
        // return false;

        // HashSet<Integer> set = new HashSet<>();
        // for (int num : nums) {
        //     if (set.contains(num))
        //         return true;
        //     set.add(num);
        // }
        // return false;
    }
}