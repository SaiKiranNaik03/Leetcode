class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        d={}
        for i in set(nums):
            d[i]=nums.count(i)
        for i in d.keys():
            if(d[i]>len(nums)/2):
                return i
        return 0;
        