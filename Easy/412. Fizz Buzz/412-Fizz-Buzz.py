class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
        newList = []
        i = 1
        while(i<=n):
            if ((i % 3 == 0) and (i % 5 == 0)):
                newList.append("FizzBuzz")
            elif (i % 3 == 0):
                newList.append("Fizz")
            elif (i % 5 == 0):
                newList.append("Buzz")
            else:
                newList.append(str(i))
            i = i+1
        return newList