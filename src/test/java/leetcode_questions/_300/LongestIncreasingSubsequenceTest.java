package leetcode_questions._300;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LongestIncreasingSubsequenceTest {

    private LongestIncreasingSubsequence longestIncreasingSubsequence;

    @Before
    public void beforeEach() {
        longestIncreasingSubsequence = new LongestIncreasingSubsequence();
    }

    @Test
    public void test1() {
        int [] nums = new int[] {10,9,2,5,3,7,101,18};
        int expected = 4;

        int actual = longestIncreasingSubsequence.lengthOfLIS(nums);

        assertThat(actual, is(expected));
    }

    @Test
    public void test2() {
        int [] nums = new int[] {0,1,0,3,2,3};
        int expected = 4;

        int actual = longestIncreasingSubsequence.lengthOfLIS(nums);

        assertThat(actual, is(expected));
    }

}
