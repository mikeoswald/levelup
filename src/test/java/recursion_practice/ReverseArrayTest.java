package recursion_practice;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ReverseArrayTest {

    private ReverseArray reverseArray;

    @Before
    public void beforeEach() {
        reverseArray = new ReverseArray();
    }

    @Test
    public void whenNullArrayISuppliedThenReturnNull() {
        int [] inputIter = new int []{ 1,2,3,4 };
        int [] inputRec = new int []{ 1,2,3,4 };
        int [] expected = new int [] { 4,3,2,1 };

        int [] actualIter = reverseArray.reverseArrayIterative(inputIter);
        int [] actualRec = reverseArray.reverseArrayRecursive(inputRec);

        assertThat(actualIter, is(expected));
        assertThat(actualRec, is(expected));

    }

    @Test
    public void whenArrayIsSuppliedThenReturnExpectedOutput() {
        int [] input = null;
        int [] expected = null;

        int [] actualIter = reverseArray.reverseArrayIterative(input);
        int [] actualRecur = reverseArray.reverseArrayRecursive(input);

        assertThat(actualIter, is(expected));
        assertThat(actualRecur, is(expected));

    }
}