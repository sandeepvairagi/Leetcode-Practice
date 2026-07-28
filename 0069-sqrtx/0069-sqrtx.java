class Solution {
    public int mySqrt(int x) {
        int l=1;
        int r=x;
        int a=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            long s=(long)mid*mid;
            if(s==x){
                return mid;
            }else if(s>x){
                r=mid-1;
            }else{
                a=mid;
                l=mid+1;
            }
        }
        return a;
    }
}