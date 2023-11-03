import java.util.LinkedList;
import java.util.Queue;
public class queue {
    public static void main(String[] args){

        //Queue is FIFO data structure.

        Queue<String> queue = new LinkedList<String>();
        // we have used LinkedList in the place of Queue as it is a interface,which is a template which we can apply to other class.
        // so we need a class which implements queue there are two of them the first is the LinkedList and the other is Priority Queue,which arranges element according to specific priority.

        System.out.println(queue.isEmpty()); // true.

    // offer is used to add an elementalso called Enqueue.
        // while poll() is used to remove a element from a queue also called dequeue.

        queue.offer("kristen");
        queue.offer("jonathan");
        queue.offer("mark");
        queue.offer("luke");

        System.out.println(queue.size()); // 4

        System.out.println(queue.contains("mark"));  // true

        queue.poll();
        queue.poll();

        System.out.println(queue.isEmpty()); // false

        System.out.println(queue); //  mark,luke

        System.out.println(queue.peek()); // mark

    }
}
