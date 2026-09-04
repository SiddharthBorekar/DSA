class Solution {
    public int removeDuplicates(int[] nums) {
        int first = 0;

        for (int last = 1; last < nums.length; last++) {
            if (nums[last] != nums[first]) {
                first++;
                nums[first] = nums[last];
            }
        }

        return first + 1;
    }
}