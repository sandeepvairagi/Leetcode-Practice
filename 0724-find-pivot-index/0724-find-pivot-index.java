class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        arr[0]=nums[0];
        for(int i=1;i<n;i++){
            arr[i]=nums[i]+arr[i-1];
        }
        for(int i=0;i<n;i++){
            int left=(i==0)?0:arr[i-1];
            int right=arr[n-1]-arr[i];
            if(left==right){
               return i;
            }
        }
        return -1;
    }
}