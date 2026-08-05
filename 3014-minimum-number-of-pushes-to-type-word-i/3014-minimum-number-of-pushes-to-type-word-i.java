class Solution {
    public int minimumPushes(String word) {
        int l = word.length();
        int push = 0;
        int cnt = 0;
        while(l > 0){
            cnt++;
            if(l<8){
                push += cnt*l;
            }
            else{
                push += cnt*8;
            }
            l=l-8;
        }
        return push;
    }
}