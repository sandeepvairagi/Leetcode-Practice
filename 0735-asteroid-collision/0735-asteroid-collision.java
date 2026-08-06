class Solution {
    public int[] asteroidCollision(int[] ast) {
        Stack<Integer> st=new Stack<>();
        for(int i:ast){
            boolean des=false;
            while(!st.isEmpty() && st.peek()>0 && i<0){
                if(st.peek()<-i){
                    st.pop();
                }else if(st.peek()==-i){
                    st.pop();
                    des=true;
                    break;
                }else{
                    des=true;
                    break;
                }
            }
            if(!des){
                st.push(i);
            }
        }
        int[] ans=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}