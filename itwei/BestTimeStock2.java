/**
 * 122. 买卖股票的最佳时机 II
 */

public class BestTimeStock2 {

    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        int max = 0;
        for(int x=1; x<prices.length; x++){
            /*
                第二天比第一天价格高就买入
             */
            if(prices[x] > prices[x-1]){
                max += prices[x] - prices[x-1];
            }
        }
        return max;
    }
}
