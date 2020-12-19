package leetcode_questions._121;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int [] input1 = new int[] {7,1,5,3,6,4};
        int [] input2 = new int[] {7,6,4,3,1};
        System.out.println(new BestTimeToBuyAndSellStock().maxProfit(input1));
        System.out.println(new BestTimeToBuyAndSellStock().maxProfit(input2));

    }
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 1){
            return 0;
        }

        //greedy approach
        int maxProfit = 0;
        int minSoFar = prices[0];

        for (int i = 1; i < prices.length; i++ ) {
            int curr = prices[i]; //1
            //System.out.println("curr " + curr);

            minSoFar = Math.min(minSoFar, curr);
            //System.out.println("minSoFar " + minSoFar);

            int tempProfit = curr - minSoFar;
            //System.out.println("tempProfit " + tempProfit);

            maxProfit = Math.max(maxProfit, tempProfit);
            //System.out.println("maxProfit " + maxProfit);
        }
        return maxProfit;
    }
}
