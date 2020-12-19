package leetcode_questions._121;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BestTimeToBuyAndSellStockTest {
    private BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock;

    @Before
    public void beforeEach() {
        bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
    }

    @Test
    public void maxProfit_1() {
        int [] input = new int[] {7,1,5,3,6,4};
        int actual = bestTimeToBuyAndSellStock.maxProfit(input);
        int expected = 5;

        assertThat(actual, is(expected));
    }

    @Test
    public void maxProfit_2() {
        int [] input = new int[] {7,6,4,3,1};
        int actual = bestTimeToBuyAndSellStock.maxProfit(input);
        int expected = 0;

        assertThat(actual, is(expected));
    }
}