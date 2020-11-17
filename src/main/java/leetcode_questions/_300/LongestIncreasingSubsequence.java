package leetcode_questions._300;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int [] nums = new int[] {0,1,0,3,2,3};
        int expected = 4;

        int actual = new LongestIncreasingSubsequence().lengthOfLIS(nums);
        System.out.println("actual == expected? " + (actual == expected));

    }

    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxans = 1;
        for (int i = 1; i < dp.length; i++) {
            int maxval = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxval = Math.max(maxval, dp[j]);
                }
            }
            dp[i] = maxval + 1;
            maxans = Math.max(maxans, dp[i]);
        }
        return maxans;
    }
}
