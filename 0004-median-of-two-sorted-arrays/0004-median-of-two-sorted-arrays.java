class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int idx2 = (n+m)/2;
        int idx1 = idx2-1;
        int c = 0;
        int i,j,ele1,ele2;
        ele1 = ele2 = -1;
        i=j=0;
        while(i < n && j<m){
            if(nums1[i] <= nums2[j]){
                if(c == idx1) ele1 = nums1[i];
                if(c == idx2) ele2 = nums1[i];
                i++;
                c++;
            }else{
                if(c == idx1) ele1 = nums2[j];
                if(c == idx2) ele2 = nums2[j];
                j++;
                c++;
            }
        }
        while(i < n){
            if(c == idx1) ele1 = nums1[i];
            if(c == idx2) ele2 = nums1[i];
            i++;c++;
        }
        while(j < m){
            if(c == idx1) ele1 = nums2[j];
            if(c == idx2) ele2 = nums2[j];
            j++;c++;
        }
        System.out.println(ele1+" "+ele2);
        if((n+m)%2 == 0){
            return (double)(ele1+ele2)/2.0;
        }
        return (double)ele2;
    }
}