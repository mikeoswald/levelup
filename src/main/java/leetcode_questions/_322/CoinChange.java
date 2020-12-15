package leetcode_questions._322;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int [] coins = new int[]{1,2,3};
        int amount = 6;
        System.out.println(new CoinChange().coinChangeTopDown(coins, amount));
        System.out.println(new CoinChange().coinChangeBottomUp(coins, amount));
    }

    public int coinChangeTopDown(int[] coins, int amount) {

        return coinChangeTopDown(coins, amount, new int[amount]);
    }

    public int coinChangeTopDown(int[] coins, int remainder, int[] cache) {
        if (remainder < 0) return -1;
        if (remainder == 0) return 0;
        if (cache[remainder - 1] != 0) return cache[remainder - 1];

        int min = Integer.MAX_VALUE;

        for(int coin : coins) {
            int res = coinChangeTopDown(coins, remainder - coin, cache);
            if (res >= 0 && res < min) {
                min = 1 + res;
            }
        }
        cache[remainder - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
        return cache[remainder - 1];
    }

    public int coinChangeBottomUp(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            int currentCalculatingAmount = i;
            for (int j = 0; j < coins.length; j++) {
                int currentCoin = coins[j];
                if (currentCoin <= currentCalculatingAmount) {
                    int currentDpVal = dp[currentCalculatingAmount];
                    int subtract = currentCalculatingAmount - currentCoin;
                    int currentDpValSubtracted = dp[subtract] + 1;

                    dp[currentCalculatingAmount] = Math.min(currentDpVal, currentDpValSubtracted);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
