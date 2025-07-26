class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        #bit manipulation
        result = 0
        for num in nums:
            result = num ^ result #xor with num
        return result