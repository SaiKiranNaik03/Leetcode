class Solution:
    def diStringMatch(self, s: str) -> List[int]:
        l = []
        n1,n2 = 0,len(s)
        for i in s:
            if(i == 'I'):
                l.append(n1)
                n1 += 1
            else:
                l.append(n2)
                n2 -= 1
        l.append(n1)
        return l