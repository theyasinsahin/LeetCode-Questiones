class Solution:
    def tribonacci(self, n: int) -> int:
        F=[0,1,1]
        if n <= 2:
            return F[n]
        for i in range(3, n+1):
            F.append(F[0]+F[1]+F[2])
            F[0] = F[1]
            F[1] = F[2]
            F[2] = F[3]
            F.pop()
        return F[2]