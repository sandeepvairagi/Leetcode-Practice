class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] st=new int[26];
        int[] pt=new int[26];
        if(p.length()>s.length()){
            return list;
        }
        for(int i=0;i<p.length();i++){
            pt[p.charAt(i)-'a']++;
        }
        int k=p.length();
        for(int i=0;i<k;i++){
            st[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(pt,st)){
            list.add(0);
        }
        for(int i=k;i<s.length();i++){
            st[s.charAt(i)-'a']++;
            st[s.charAt(i-k)-'a']--;
            if (Arrays.equals(pt, st)){
                list.add(i - k + 1);
            }

        }
        return list;
    }
}