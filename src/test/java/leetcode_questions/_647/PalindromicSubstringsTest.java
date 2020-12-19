package leetcode_questions._647;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PalindromicSubstringsTest {

    private PalindromicSubstrings palindromicSubstrings;

    @Before
    public void beforeEach() {
        palindromicSubstrings = new PalindromicSubstrings();
    }


    @Test
    public void countSubstrings() {
        String input = "abcb";
        int actual = palindromicSubstrings.countSubstrings(input);
        int expected = 5;

        assertThat(actual, is(expected));
    }

    @Test
    public void countSubstringsOptimal() {
        String input = "abcb";
        int actual = palindromicSubstrings.countSubstringsOptimal(input);
        int expected = 5;

        assertThat(actual, is(expected));
    }
}