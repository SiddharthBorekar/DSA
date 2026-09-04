class Solution {
    public int removeDuplicates(int[] nums) {
        int first = 0;
        int last = 1;

        while (last < nums.length) {
            if(nums[first] != nums[last]){
                first++;
                nums[first] = nums[last];
            }
            last++;
        }
        return first + 1;
    }
}
