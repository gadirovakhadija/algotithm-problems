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

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{2,1,4,5,2,4,5}));
    }

}
