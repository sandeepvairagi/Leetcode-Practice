class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int t1=0;
        while(t1<n){
            for(int i=t1+1;i<n;i++){
                if(numbers[t1]+numbers[i]==target){
                    return new int[]{t1+1,i+1};
                }
            }
            t1++;
        }
        return new int[]{0,0};
    }
}