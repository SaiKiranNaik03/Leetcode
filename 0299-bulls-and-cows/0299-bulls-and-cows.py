class Solution:
    def getHint(self, secret: str, guess: str) -> str:
        '''c1=c2=0
        for i in range(len(secret)):
            if(secret[i] == guess[i]):
                c1+=1
        
        for i in range(len(secret)):
            if((secret[i] in guess) and (secret[i] != guess[i])):
                c2+=1
                
        ans=str(c1)+"A"+str(c2)+"B"
        return ans'''
        
        dic=Counter(secret)-Counter(guess)
        cnt=0
        for i in range(len(secret)):
            if secret[i]==guess[i]:
                cnt+=1
        cnt2=len(secret)-sum(dic.values())-cnt
        return str(cnt)+"A"+str(cnt2)+"B"
        