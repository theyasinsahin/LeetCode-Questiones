class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLen = Integer.MAX_VALUE;
        for (String str : strs){
            int strLen = str.length();
            if(strLen < minLen){
                minLen = strLen;
            }
        }

        int i = 0;
        while(i < minLen){
            char theLetter = strs[0].charAt(i);
            for (String str: strs) {
                if(theLetter != str.charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
            i++;
        }
        return strs[0].substring(0,i);
    }
}