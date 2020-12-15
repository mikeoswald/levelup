package leetcode_questions._760;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FindAnagramMappingsTest {

    private FindAnagramMappings findAnagramMappings;

    @Before
    public void beforeEach() {
        findAnagramMappings = new FindAnagramMappings();
    }

    @Test
    public void anagramMappingsBF() {
        int[] A = new int[]{12, 28, 46, 32, 50};
        int[] B = new int[]{50, 12, 32, 46, 28};
        int[] actual = findAnagramMappings.anagramMappingsBF(A, B);

        int[] expectedArray = new int[]{1, 4, 3, 2, 0};

        assertThat(actual, is(expectedArray));
    }

    @Test
    public void anagramMappings() {

        int[] A = new int[]{12, 28, 46, 32, 50};
        int[] B = new int[]{50, 12, 32, 46, 28};
        int[] actual = findAnagramMappings.anagramMappings(A, B);

        int[] expectedArray = new int[]{1, 4, 3, 2, 0};

        assertThat(actual, is(expectedArray));
    }
}