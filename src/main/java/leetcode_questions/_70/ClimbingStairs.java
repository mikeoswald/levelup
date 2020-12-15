package leetcode_questions._70;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 70;

       // System.out.println(new ClimbingStairs().climbStairsBf(n));
        System.out.println(new ClimbingStairs().climbStairsBfWithMemo(n));
        System.out.println(new ClimbingStairs().climbStairsDp(n));
        System.out.println(new ClimbingStairs().climbStairsFib(n));
    }

    public int climbStairsBf(int n) {
        return climbStairsBf(0, n);
    }

    public int climbStairsBfWithMemo(int n) {
        int [] memo = new int [n + 1];
        return climbStairsBfWithMemo(0, n, memo);
    }

    public int climbStairsBf(int i, int n) {
        if (i > n) { //have gone past last stair?
            return 0;
        }
        if (i == n) { //have we reached last stair?
            return 1;
        }
        int climbOneStair = climbStairsBf(i + 1, n);
        int climbTwoStair = climbStairsBf(i + 2, n);
        return climbOneStair + climbTwoStair;
    }

    public int climbStairsBfWithMemo(int i, int n, int [] memo) {
        if (i > n) { //have gone past last stair?
            return 0;
        }
        if (i == n) { //have we reached last stair?
            return 1;
        }
        if(memo[i] > 0) return memo[i];
        int climbOneStair = climbStairsBfWithMemo(i + 1, n, memo);
        int climbTwoStair = climbStairsBfWithMemo(i + 2, n, memo);
        memo[i] = climbOneStair + climbTwoStair;
        return memo[i];
    }

    public int climbStairsDp(int n) {
        // basically using the equation of dp[i] = dp[i - 1] +  dp[i - 2];
        // So to calcluate any step, it is the sum of ways of reaching i - 1 and i - 2 steps.
        int [] dp = new int [n + 1]; // to avoid confusion for 0 index, align it with the stairs which is index 1
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++){
            dp[i] = dp[i -1] + dp[i - 2];
        }
        return dp[n];
    }

    public int climbStairsFib(int n) {
        int first = 1;
        int second = 2;
        int sum = 0;

        for(int i = 3; i <= n; i ++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;
    }
}
