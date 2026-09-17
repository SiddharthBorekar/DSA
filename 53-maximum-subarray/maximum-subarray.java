class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            //step1 : create sum  
            sum = sum + nums[i];
            //step2 : update maxi
            maxi = Math.max(maxi ,sum);
            //step3 : check sum and negative value
            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
}