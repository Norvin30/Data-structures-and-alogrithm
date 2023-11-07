import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListvsArrayList {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();


        long starttime;
        long endtime;
        long elapsetime;

        for(int i = 0; i < 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }

        starttime = System.nanoTime();

        //linkedList.get(0);
        //linkedList.get(500000);
        //linkedList.get(999999);
        //linkedList.remove(0);
         //linkedList.remove(500000);
        linkedList.remove(999999);

        endtime = System.nanoTime();

        elapsetime = endtime - starttime;

        System.out.println("LinkedList:\t" + elapsetime +"ns");


        starttime = System.nanoTime();

        //arrayList.get(0);
        //arrayList.get(500000);
       //arrayList.get(999999);
        //arrayList.remove(0);
        //arrayList.remove(500000);
        arrayList.remove(999999);

        endtime = System.nanoTime();

        elapsetime = endtime - starttime;

        System.out.println("ArrayList:\t" + elapsetime +"ns");
    }
}
