class Solution {
    static boolean checkPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int countPrimeSetBits(int left, int right) {
        int c = 0;
        for (int n = left; n <= right; n++) {
            int count = Integer.bitCount(n);
            if (checkPrime(count)) {
                c++;
            }
        }
        return c;
    }
}
