class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        c=ones=0
        for i in range(len(nums)):
            if(nums[i]==1):
                c+=1
            elif(nums[i]==0):
                c=0
            ones = max(c,ones)
        return ones
        