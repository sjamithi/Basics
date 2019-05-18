package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRooms {
     static class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }
    private static int minMeetingRooms(Interval[] intervals) {
         if (intervals.length == 0)
             return 0;
        Arrays.sort(intervals, Comparator.comparingInt(o -> o.start));

        PriorityQueue<Interval> heap = new PriorityQueue<>(intervals.length, Comparator.comparingInt(o -> o.end));

        heap.offer(intervals[0]);

        for (int i=1; i<intervals.length; i++) {
            Interval interval = heap.poll();

            if (intervals[i].start >= interval.end) {
                interval.end = intervals[i].end;
            } else {
                heap.offer(intervals[i]);
            }
            heap.offer(interval);
        }
        return heap.size();
    }
    public static void main(String[] args) {
        Interval a = new Interval(0, 30);
        Interval b = new Interval(5, 10);
        Interval c = new Interval(15, 20);
        Interval[] intervals = {a,b,c};
        System.out.println(minMeetingRooms(intervals));
    }
}
