class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0, c = 0;
        int idx2 = (n + m) / 2;
        int idx1 = idx2 - 1;
        int ele1 = -1;
        int ele2 = -1;

        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                if (c == idx1) ele1 = nums1[i];
                if (c == idx2) ele2 = nums1[i];
                c++;
                i++;
            } else {
                if (c == idx1) ele1 = nums2[j];
                if (c == idx2) ele2 = nums2[j];
                c++;
                j++;
            }
        }

        while (i < n) {
            if (c == idx1) ele1 = nums1[i];
            if (c == idx2) ele2 = nums1[i];
            c++;
            i++;
        }

        while (j < m) {
            if (c == idx1) ele1 = nums2[j];
            if (c == idx2) ele2 = nums2[j];
            c++;
            j++;
        }

        if ((n + m) % 2 == 0) {
            return (ele1 + ele2) / 2.0;
        }
        return ele2;
    }
}
