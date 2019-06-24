package collections;


import java.util.ArrayDeque;
import java.util.Deque;


public class DequeueSample {
    public static void main(String[] args) {
        Deque<String> dequeue = new ArrayDeque<String>();
        dequeue.add("test1");
        dequeue.add("test2");
        dequeue.add("test3");
        dequeue.add("test4");

        dequeue.removeFirst();
        dequeue.removeLast();


        dequeue.addFirst("test0");
        dequeue.addLast("test5");

        System.out.println(dequeue);
    }

}
