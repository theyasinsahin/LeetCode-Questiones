class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        if target > nums[-1]:
            return len(nums)
        index = 0
        for num in nums:
            if num >= target:
                return index
            index += 1