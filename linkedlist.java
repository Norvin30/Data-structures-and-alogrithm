import java.util.*;

public class linkedlist {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();

        // push method is of adding a element into the stack. here linkedlist is used with stack.

        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");

        linkedList.add(3,"X");

        System.out.println(linkedList);

        // offer method is of queue. here linkedlist is used with queue.

        linkedList.offer("S");
        linkedList.offer("Z");
        linkedList.offer("V");
        linkedList.offer("N");

        linkedList.add(3,"Q");

        System.out.println(linkedList.peekFirst());

        System.out.println(linkedList.peekLast());

        linkedList.addFirst("0"); // addFirst method is used to add element to the head of linked list.
        linkedList.addLast("1"); // addLast method is used to add element to the tail of linked list.

        String first = linkedList.removeFirst(); // removeFirst method is used to remove element which is the head of linked list.
        String last = linkedList.removeLast(); // removeLast method is used to remove element on the tail of linkedlist.

        System.out.println(linkedList);
    }
}
