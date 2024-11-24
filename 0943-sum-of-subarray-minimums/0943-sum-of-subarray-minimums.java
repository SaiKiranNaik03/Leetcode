class Solution {
    public int sumSubarrayMins(int[] arr) {
        int total = 0;
        int[] pse = PSE(arr); 
        int[] nse = NSE(arr); 
        int mod = (int) 1e9 + 7;

        for (int i = 0; i < arr.length; i++) {
            int left = i - pse[i]; 
            int right = nse[i] - i;
            total = (int) ((total + (long) left * right * arr[i] % mod) % mod);
        }
        return total;
    }

    private int[] NSE(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> stk = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stk.isEmpty() && arr[stk.peek()] >= arr[i]) {
                stk.pop();
            }
            nse[i] = stk.isEmpty() ? n : stk.peek(); 
            stk.push(i);
        }
        return nse;
    }

    private int[] PSE(int[] arr) {
        int n = arr.length;
        int[] pse = new int[n];
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stk.isEmpty() && arr[stk.peek()] > arr[i]) {
                stk.pop();
            }
            pse[i] = stk.isEmpty() ? -1 : stk.peek(); 
            stk.push(i);
        }
        return pse;
    }
}