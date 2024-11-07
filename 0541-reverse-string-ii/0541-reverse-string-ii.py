class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        l = list(s)
        i=0
        while(i<len(s)):
            l[i:i+k]=l[i:i+k][::-1]
            i+=2*k
        return ''.join(l)
    