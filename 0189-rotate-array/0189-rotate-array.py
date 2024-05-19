class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        k=k%len(nums)
        l1=nums[:len(nums)-k]
        l2=nums[len(nums)-k:]
        l1.reverse()
        l2.reverse()
        nums.clear()
        nums.extend(l1+l2)
        nums.reverse()
        """
        Do not return anything, modify nums in-place instead.
        """
        