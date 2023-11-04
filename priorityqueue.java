
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
public class priorityqueue {
    public static void main(String[] args){

        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
//"Collections.reverseOrder()" is used to get the queue in the descending order.

        queue.offer(4.0);
        queue.offer(5.0);
        queue.offer(1.0);
        queue.offer(2.0);
        queue.offer(3.0);

while(!queue.isEmpty()){
    System.out.println(queue.poll());
}
        System.out.println(queue);

        queue.poll();
        queue.poll();



    }

}
