package leetcode_questions._322;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CoinChangeTest {
    private CoinChange coinChange;

    @Before
    public void beforeEach() {
        coinChange = new CoinChange();
    }

    @Test
    public void testTopDown() {
        int [] coins = new int[]{1,2,5};
        int amount = 11;

        int actual = coinChange.coinChangeTopDown(coins, amount);

        assertThat(actual, is(3));
    }

    @Test
    public void testBottomUp() {
        int [] coins = new int[]{1, 2, 5};
        int amount = 11;

        int actual = coinChange.coinChangeBottomUp(coins, amount);

        assertThat(actual, is(3));
    }

    @Test
    public void testBottomUp_case2() {
        int [] coins = new int[]{2, 3, 5};
        int amount = 6;

        int actual = coinChange.coinChangeBottomUp(coins, amount);

        assertThat(actual, is(2));
    }
}