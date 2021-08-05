import java.util.ArrayDeque;
// import java.util.*;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq=new ArrayDeque<>();
        
        adq.offer(15);
        adq.offerFirst(99);
        adq.offerLast(9);
        adq.offer(2);        
        adq.offer(10);
        System.out.println(adq);
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.peekLast());
    }
}
