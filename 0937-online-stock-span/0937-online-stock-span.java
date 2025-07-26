class StockSpanner {
    Stack<Integer> s;     
    ArrayList<Integer> prices;  
    int index;

    public StockSpanner() {
        s = new Stack<>();
        prices = new ArrayList<>();
        index = 0;
    }

    public int next(int price) {
        prices.add(price);

        while (!s.isEmpty() && prices.get(s.peek()) <= price) {
            s.pop();
        }

        int span;
        if (s.isEmpty()) {
            span = index + 1;
        } else {
            span = index - s.peek();
        }

        s.push(index);
        index++;
        return span;
    }
}