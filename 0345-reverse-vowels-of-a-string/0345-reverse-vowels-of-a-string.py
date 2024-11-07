class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels = ['a','e','i','o','u','A','E','I','O','U']
        l,r = 0,len(s)-1
        ans = ""
        while(l<len(s)):
            if(s[l] in vowels and s[r] in vowels):
                ans += s[r]
                l += 1
                r -= 1
            elif(s[l] in vowels and s[r] not in vowels):
                r -= 1
            elif(s[l] not in vowels):
                ans += s[l]
                l+=1
        return ans