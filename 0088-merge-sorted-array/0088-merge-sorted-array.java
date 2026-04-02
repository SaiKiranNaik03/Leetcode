class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx = m+n-1;
        int f = m-1;
        int s = n-1;

        while(f>=0 && s>=0){
            if(nums1[f] >= nums2[s]){
                nums1[idx] = nums1[f];
                idx--;
                f--;
            }else{
                nums1[idx] = nums2[s];
                idx--;
                s--;
            }
        }
        while(f>=0) nums1[idx--] = nums1[f--];
        while(s>=0) nums1[idx--] = nums2[s--];
    }
}