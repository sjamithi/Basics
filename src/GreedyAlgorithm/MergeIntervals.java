package GreedyAlgorithm;

import java.util.*;

public class MergeIntervals {
    private static List<Interval> merge(List<Interval> intervals) {
        LinkedList<Interval> list = new LinkedList<>();
        if (intervals.size() == 0)
            return list;
        intervals.sort(Comparator.comparingInt(a -> a.start));
        for (Interval interval: intervals) {
            if (list.isEmpty() || list.getLast().end < interval.start) {
                list.add(interval);
            } else {
                list.getLast().end = Math.max(list.getLast().end, interval.end);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Interval a = new Interval(1, 3);
        Interval b = new Interval(2, 6);
        Interval c = new Interval(8, 10);
        Interval d = new Interval(15, 18);
        List<Interval> intervals = Arrays.asList(a, b, c, d);
        List<Interval> merge = merge(intervals);
        merge.forEach(i -> System.out.println(i.start + " " + i.end));
    }
}

