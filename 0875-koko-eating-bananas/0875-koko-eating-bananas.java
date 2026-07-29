class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minspeed=1;
        int maxspeed=0;
        for(int i:piles){
            maxspeed=Math.max(maxspeed,i);
        }
        while(minspeed<=maxspeed){
            int mid=minspeed+(maxspeed-minspeed)/2;
            long hours=0;
            for(int i:piles){
                hours+=Math.ceil((double)i/mid);
            }
            if(hours<=h){
                maxspeed=mid-1;
            }else{
                minspeed=mid+1;
            }
        }
        return minspeed;
    }
}