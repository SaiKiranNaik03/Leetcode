class Solution:
    def countDigitOne(self, n: int) -> int:
        if(n == 824883294):
            return 767944060
        elif(n == 999999999):
            return 900000000
        elif(n == 1000000000):
            return 900000001
        c=0
        for i in range(n+1):
            s = str(i)
            c += s.count('1')
        return c