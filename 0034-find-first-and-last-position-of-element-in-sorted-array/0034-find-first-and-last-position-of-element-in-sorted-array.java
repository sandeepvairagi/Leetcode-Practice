class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=first(nums,target);
        int last=last(nums,target);
        return new int[]{first,last};
    }
    public int first(int[] nums,int target){
        int l=0;
        int n=nums.length;
        int r=n-1;
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                ans=mid;
                r=mid-1;
            }else if(nums[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
     public int last(int[] nums,int target){
        int l=0;
        int n=nums.length;
        int r=n-1;
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                ans=mid;
                l=mid+1;
            }else if(nums[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
}