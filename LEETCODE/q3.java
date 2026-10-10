class Solution{
    public int longestSubstring(String s){
        HashSet<Character> set=new HashSet<>();
        int maxLen=0;
        int left=0;
        for(int r=0;r<s.length();r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(left));
                left++;
            }
           set.add(s.charAt(r));
            maxLen=Math.max(maxLen,r-left+1);
        }
        return maxLen;
    }
}