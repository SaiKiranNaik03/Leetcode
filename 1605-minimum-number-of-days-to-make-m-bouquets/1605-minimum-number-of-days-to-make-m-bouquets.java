class Solution {
    static int total(int arr[], int day, int k) {
        int total = 0, cnt = 0;
        for (int b : arr) {
            if (b <= day) {
                cnt++;
            } else {
                total += cnt / k;
                cnt = 0;
            }
        }
        total += cnt / k;
        return total;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length) return -1;

        int low = 1, high = 0;
        for (int b : bloomDay) high = Math.max(high, b);

        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int flo = total(bloomDay, mid, k);
            if (flo >= m) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
