class FreqStack:

    def __init__(self):
        self.countMap = {}
        self.maxCount = 0
        self.stackMap = {}

    def push(self, val: int) -> None:
        newCountOfVal = 1 + self.countMap.get(val, 0)
        self.countMap[val] = newCountOfVal
        if newCountOfVal > self.maxCount:
            self.maxCount = newCountOfVal
            self.stackMap[newCountOfVal] = []
        self.stackMap[newCountOfVal].append(val)

    def pop(self) -> int:
        valueForPop = self.stackMap[self.maxCount].pop()
        self.countMap[valueForPop] -= 1
        if not self.stackMap[self.maxCount]:
            self.maxCount -= 1
        return valueForPop

# Your FreqStack object will be instantiated and called as such:
# obj = FreqStack()
# obj.push(val)
# param_2 = obj.pop()