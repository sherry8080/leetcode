package array;

import java.util.Arrays;

public class MeetingRoomII {
    int minMeetingRooms(Interval[] intervals) {
        int[] starts = new int[intervals.length], ends = new int[intervals.length];
        int res = 0, endpos = 0;
        int i = intervals.length;
        for (Interval a: intervals) {
            starts[i - 1] = a.start;
            ends[i - 1] = a.end;
            i--;
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        for (int j = 0; j < intervals.length; ++i) {
            if (starts[j] < ends[endpos]) ++res;
            else ++endpos;
        }
        return res;
    }
}
