class Solution {
    static int[] getLH(int arr[]) {
        int mini = arr[0];
        for (int ele : arr) {
            mini = Math.min(ele, mini);
        }
        return new int[]{mini}; // Only need min, not sum
    }

    static long getTrips(int arr[], long k) {
        long c = 0;
        for (int ele : arr) {
            c += k / ele;
        }
        return c;
    }

    public long minimumTime(int[] time, int totalTrips) {
        int res[] = getLH(time);
        long low = 1;
        long high = (long) res[0] * totalTrips;
        long ans = high;

        while (low <= high) {
            long mid = (low + high) / 2;
            long result = getTrips(time, mid);
            if (result >= totalTrips) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

}