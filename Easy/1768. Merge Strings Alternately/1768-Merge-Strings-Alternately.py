class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        string = ""
        i = 0
        while ((len(word1) - i-1 >= 0) or (len(word2) - i-1>= 0)):
            if (len(word1)-i-1 >= 0):
                string += word1[i]
            if (len(word2)-i-1 >= 0):
                string += word2[i]
            i += 1
        return string