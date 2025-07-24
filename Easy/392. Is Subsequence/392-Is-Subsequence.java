class Solution {
    public boolean isSubsequence(String s, String t) {
        int counter = 0;
        int sLen = s.length();
        for (int i = 0; i < t.length(); i++) {
            if(sLen > counter){
                if(t.charAt(i) == s.charAt(counter)){
                    if(counter < sLen)counter++;
                    else return false;
                }
            }else{
                return true;
            }

        }
        if(counter != sLen)return false;
        return true;
    }
}