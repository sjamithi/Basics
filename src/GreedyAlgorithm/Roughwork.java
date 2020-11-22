package GreedyAlgorithm;

import java.util.*;

public class Roughwork {

    public static List<Interval> merge(List<Interval> intervals) {
        List<Interval> res = new LinkedList<>();
        if (intervals == null || intervals.size() == 0)
            return res;

        intervals.sort((a, b) -> a.start - b.start);

        PriorityQueue<Interval> heap = new PriorityQueue<>((a,b) -> a.end - b.end);
        heap.offer(intervals.get(0));

        for (int i=1; i< intervals.size(); i++) {
            Interval temp = heap.poll();

            if (intervals.get(i).start <= temp.end) {
                temp.end = intervals.get(i).end;
            } else {
                heap.offer(intervals.get(i));
            }

            heap.offer(temp);
        }

        res.addAll(heap);

        return res;

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
