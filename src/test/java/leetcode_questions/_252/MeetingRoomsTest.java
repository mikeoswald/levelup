package leetcode_questions._252;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MeetingRoomsTest {
    private MeetingRooms meetingRooms;

    @Before
    public void beforeEach() {
        meetingRooms = new MeetingRooms();
    }

    @Test
    public void canAttendMeetings_falseCase() {
        int [][] input = new int[][]{{0,30},{5,10},{15,20}};

        boolean actual = meetingRooms.canAttendMeetings(input);
        boolean expected = false;

        assertThat(actual, is(expected));
    }

    @Test
    public void canAttendMeetings_trueCase() {
        int [][] input = new int[][]{{7,10},{2,4}};

        boolean actual = meetingRooms.canAttendMeetings(input);
        boolean expected = true;

        assertThat(actual, is(expected));
    }
}