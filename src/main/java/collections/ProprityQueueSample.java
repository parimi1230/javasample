package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class ProprityQueueSample {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<String>();
        queue.add("e");
        queue.add("F");
        queue.add("o");

        queue.remove();

        System.out.println(queue);
    }

}
