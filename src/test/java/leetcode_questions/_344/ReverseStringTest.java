package leetcode_questions._344;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ReverseStringTest {
    private ReverseString reverseString;

    @Before
    public void beforeEach() {
        reverseString = new ReverseString();
    }

    @Test
    public void testBottomUp() {
        char[] inputArray = "hello".toCharArray();
        char[] expectedArray = "olleh".toCharArray();

        reverseString.reverseStringIteratively(inputArray);

        assertThat(inputArray, is(expectedArray));
    }

}