import java.util.ArrayList;

class StockSpan {

    ArrayList<Integer> prices = new ArrayList<>();
    ArrayList<Integer> spans = new ArrayList<>();

    void calcSpan(int price) {
        int index = prices.size() - 1;

        while (index >= 0 && price >= prices.get(index)) {
            int span = spans.get(index);
            index = index - span;
        }

        prices.add(price);
        int element_index = prices.size() - 1;
        int span = element_index - index;
        spans.add(span);

    }

    void print() {
        System.out.println("Prices: " + prices);
        System.out.println("Spans: " + spans);
    }

    public static void main(String[] args) {
        int[] stock = { 100, 80, 60, 70, 60, 75, 85 };

        StockSpan ss = new StockSpan();

        for (int i = 0; i < stock.length; i++) {
            ss.calcSpan(stock[i]);
        }

        ss.calcSpan(100);

        ss.print();

    }

}
