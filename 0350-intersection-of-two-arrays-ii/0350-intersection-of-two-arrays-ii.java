class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length;
        int m = nums2.length;
        int i=0;
        int j=0;
        ArrayList<Integer> res = new ArrayList<>();
        while(i < n && j < m){
            if(nums1[i] == nums2[j]){
                res.add(nums1[i]);
                i++;j++;
            }
            else if(nums1[i] > nums2[j]) j++;
            else i++;
        }
        int[] arr = new int[res.size()];
        for (int k = 0; k < res.size(); k++) {
            arr[k] = res.get(k);
        }
        return arr;

    }
}