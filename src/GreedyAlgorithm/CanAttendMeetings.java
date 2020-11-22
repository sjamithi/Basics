package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class CanAttendMeetings {
    private static boolean canAttend(Interval[] intervals) {
        if (intervals.length == 0)
            return true;
        Arrays.sort(intervals, Comparator.comparingInt(o -> o.start));

        for (int i=0; i< intervals.length-1; i++) {
            if(intervals[i].end > intervals[i+1].start)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Interval a = new Interval(0, 5);
        Interval b = new Interval(5, 15);
        Interval c = new Interval(10, 20);
        Interval[] intervals = {a,b,c};
        System.out.println(canAttend(intervals));
    }
}
