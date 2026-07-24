class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int total=0;
        int curmax=0;
        int maxsum=nums[0];
        int curmin=0;
        int minsum=nums[0];
        for(int i:nums){
            curmax=Math.max(i,curmax+i);
            maxsum=Math.max(maxsum,curmax);

            curmin=Math.min(i,curmin+i);
            minsum=Math.min(minsum,curmin);

            total+=i;
        }
        if(maxsum<0)
            return maxsum;

        return Math.max(maxsum,total-minsum);
    }
}