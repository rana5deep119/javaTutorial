class Solution{
    public int characterReplacement(String s,int k){
        int maxlen=0;
        int maxFreq=0;
        HashMap<Character,Integer> mp=new HashMap<>();
        int left=0;
        for(int r=0;r<s.length();r++){
            char rch=s.charAt(r);
            mp.put(rch,mp.getOrDefault(rch,0)+1);
            maxFreq=Math.max(rch,maxFreq);
            while((r-left+1)-maxFreq>k){
                char lch=s.charAt(left);
                mp.put(lch,mp.get(lch)-1);
                left++;
            }
            maxlen=Math.max(maxlen, r-left+1);
        }
        return maxlen;
    }
}