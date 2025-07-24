class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        sum1 = 0
        result = 0
        for i in accounts:
            for j in i:
                sum1 += j
            if result < sum1:
                result = sum1
            sum1 = 0
        return result