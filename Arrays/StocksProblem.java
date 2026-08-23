public class StocksProblem {
    public static int BuyAndSellStocks(int Prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < Prices.length; i++) {
            //profit
            if(buyPrice<Prices[i]) {
                int profit = Prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit, profit);
            }
            else{
                buyPrice=Prices[i];
            }
        }
        return maxProfit;

    }
    public static void main(String[] args) {
        int Prices[] = {7, 6, 4,  3, 1};
        System.out.println(BuyAndSellStocks(Prices));
         
    }
    
}
