class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1Len = word1.length();
        int w2Len = word2.length();

        int length = Math.max(word1.length(), word2.length());

        String mergedString = "";
        for (int i = 0; i < length; i++) {
            if(w1Len>i){
                if(i == w1Len-1){
                    mergedString += word1.substring(i);
                }else{
                    mergedString += word1.substring(i,i+1);
                }
            }
            if(w2Len>i){
                if(i == w2Len-1){
                    mergedString += word2.substring(i);
                }else{
                    mergedString += word2.substring(i,i+1);
                }
            }
        }
        return mergedString;
    }
}