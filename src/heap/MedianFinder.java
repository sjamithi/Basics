package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

class MedianFinder {
    PriorityQueue<Integer> inc;
    PriorityQueue<Integer> dec;
    public MedianFinder() {
        inc = new PriorityQueue<>((a,b) -> b-a);
        dec = new PriorityQueue<>((a,b) -> a-b);
    }

    public void addNum(int num) {
       if (inc.size() == dec.size()) {
           dec.offer(num);
           inc.offer(dec.poll());
       } else {
           inc.offer(num);
           dec.offer(inc.poll());
       }
    }

    public double findMedian() {
     if (inc.size() == dec.size()) {
         return ((double)inc.peek() + (double)dec.peek())/2;
     }
     return inc.peek();
}
    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
         medianFinder.addNum(2);
         medianFinder.addNum(3);
         medianFinder.addNum(4);
         medianFinder.addNum(5);
         double median = medianFinder.findMedian();
        System.out.println(median);
    }
}
