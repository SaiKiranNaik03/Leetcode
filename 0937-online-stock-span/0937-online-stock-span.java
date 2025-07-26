 class StockSpanner {
    public List<Integer> list = new ArrayList<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        
        int cnt = 0;
        if(list.size() == 0) {
            list.add(price);
            return 1;
        }
        list.add(price);
        int n = list.size();
        for(int i = n-2; i >= 0; i--) {
            if(list.get(n-1) >= list.get(i)) {
                cnt++;
            }
            else {
                break;
            }
        }
        return cnt+1;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */