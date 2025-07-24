class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        newList = []
        result = 0
        for num in nums:
            result += num
            newList.append(result)
        return newList