package algorithmProblems;

import java.util.*;

public class BestBuySell {

    public static int maxProfit(int[] prices) {
        //in progress for best result
        List<Integer> list = new ArrayList<>();
        for (int j=0;j< prices.length;j++) {
            for (int i = j; i < prices.length; i++) {

                list.add(prices[j]-prices[i]);
            }
        }

        Collections.sort(list);

        return -list.get(0);
    }

    public int maxProfit2(int[] prices) {
        int min_price = prices[0];
        int maxprof = 0;

        for(int i=1;i<prices.length;i++){
            maxprof = Math.max(maxprof,prices[i]-min_price);
            min_price = Math.min(prices[i],min_price);
        }

        return maxprof;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{2,1,4,5,2,4,5}));
    }

}
