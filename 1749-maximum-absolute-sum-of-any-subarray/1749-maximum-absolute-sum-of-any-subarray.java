class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int curmax=nums[0];
        int maxsum=nums[0];
        int curmin=nums[0];
        int minsum=nums[0];
        for(int i=1;i<nums.length;i++){
            curmax=Math.max(nums[i],curmax+nums[i]);
            maxsum=Math.max(maxsum,curmax);

            curmin=Math.min(nums[i],nums[i]+curmin);
            minsum=Math.min(curmin,minsum);
        }
        return Math.max(maxsum,-minsum);
    }
}