class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int low=1;
        int high=10000000;
         if (dist.length > Math.ceil(hour)) {
            return -1;
        }
        while(low<high){
            int mid=low+(high-low)/2;
            if(check(dist,hour,mid)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public boolean check(int[] dist,double hour,int mid){
        double time=0;
        for(int i=0;i<dist.length;i++){
            double t=(double) dist[i]/mid;
            if(i==dist.length-1){
                time+=t;
            }else{
                time+=Math.ceil(t);
            }
        }
        return time<=hour;
    }
}