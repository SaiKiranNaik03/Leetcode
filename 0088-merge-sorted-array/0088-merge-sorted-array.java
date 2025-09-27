class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> res = new ArrayList<>();
        int i=0;
        int j=0;
        while(i < m && j < n ){
            if(nums1[i] <= nums2[j]){
                res.add(nums1[i]);
                i++;
            }else{
                res.add(nums2[j]);
                j++;
            }
        }
        while(i < m) res.add(nums1[i++]);
        while(j < n) res.add(nums2[j++]);

        for(int k=0;k<n+m;k++){
            nums1[k] = res.get(k);
        }
    }
}