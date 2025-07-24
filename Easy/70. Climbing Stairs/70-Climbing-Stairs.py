class Solution:
    def climbStairs(self, n: int) -> int:
        num1 = 0
        num2 = 1
        for i in range(1, n+1):
            new_num = num1 + num2
            num1 = num2
            num2 = new_num
        return new_num
