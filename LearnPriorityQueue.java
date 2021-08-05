import java.util.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq=new PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(40);
        pq.offer(20);
        //Here MinHeap is being implemented
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());
        Queue<Integer> pqr=new PriorityQueue<>(Comparator.reverseOrder());
        pqr.offer(30);
        pqr.offer(10);
        pqr.offer(40);
        pqr.offer(20);
        //Here MaxHeap is being implemented
        System.out.println(pqr);
        System.out.println(pqr.poll());
        System.out.println(pqr);
        System.out.println(pqr.peek());
    }
}
