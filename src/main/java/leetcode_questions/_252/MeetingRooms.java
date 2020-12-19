package leetcode_questions._252;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms {
    public static void main(String[] args) {
        int [][] input1 = new int[][]{{0,30},{5,10},{15,20}};
        int [][] input2 = new int[][]{{7,10},{2,4}};
        System.out.println(new MeetingRooms().canAttendMeetings(input1));
        System.out.println(new MeetingRooms().canAttendMeetings(input2));
    }

    public boolean canAttendMeetings(int[][] intervals) {
        if (intervals == null || intervals.length < 1) {
            return true;
        }

        //need to sort the [][] array
        //Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        for (int i = 0; i < intervals.length - 1; i ++ ) {
            int currEnd = intervals[i][1];
            int nextStart = intervals[i + 1][0];
            if (currEnd > nextStart) {
                return false;
            }
        }
        return true;
    }
}
