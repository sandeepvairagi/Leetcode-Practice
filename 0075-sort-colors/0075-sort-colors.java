class Solution {
    public void sortColors(int[] nums) {
        int cz=0;
        int co=0;
        int ct=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                cz++;
            }else if(nums[i]==1){
                co++;
            }else{
                ct++;
            }
        }
        int i=0;
        while(cz>0){
            nums[i]=0;
            cz--;
            i++;
        }
        while(co>0){
            nums[i]=1;
            co--;
            i++;
        }
        while(ct>0){
            nums[i]=2;
            ct--;
            i++;
        }
    }
}