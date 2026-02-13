import java.util.PriorityQueue;

public class MedianFinder {
    PriorityQueue<Integer> small;
    PriorityQueue<Integer> large;

    public MedianFinder() {
        small = new PriorityQueue<>((a,b) -> b-a);
        large = new PriorityQueue<>();
    }

    public void addNum(int num) {
        small.add(num);
        large.add(small.poll());

        if(large.size() > small.size()){
            small.add(large.poll());
        }
    }

    public double findMedian() {
        if(small.size() > large.size()) return small.peek();
        double ans = (double)(small.peek() + large.peek())/2;
        return ans;
    }
}