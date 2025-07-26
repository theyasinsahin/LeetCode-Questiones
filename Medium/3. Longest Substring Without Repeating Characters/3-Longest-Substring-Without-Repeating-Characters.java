class Solution {
    public int lengthOfLongestSubstring(String s) {
        String ss = "";
        int start = 0;
        int maxLen = 0;
        int len = 0;
        int size = s.length();
        for(int i = 0; i<size; i++){
            if(!(ss.contains(s.substring(i,i+1)))){
                len++;
                ss = ss+s.charAt(i);
            }else{
                if(maxLen < len){
                    maxLen = len;
                }
                len = 1;
                i = start++;
                ss = ""+s.charAt(i);
            }
        }
        return Math.max(maxLen, len);
    }
}