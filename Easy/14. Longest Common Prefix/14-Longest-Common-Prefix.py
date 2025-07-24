class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        common_prefix = ""
        min_length = min(len(word) for word in strs)
        for i in range(min_length):
            char = strs[0][i]
            if all(word[i] == char for word in strs):
                common_prefix += char
            else:
                break
        return common_prefix