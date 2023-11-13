import java.util.Hashtable;

public class hashtable {
    public static  void main(String[]args){
        Hashtable<Integer, String>  table = new Hashtable<>(10);

        // hashtable is a data structure that uniques keys to value example<Integer, String>.

        table.put(100, "Norvin");
        table.put(213, " bhaiya");
        table.put(312, "didi");
        table.put(404, "Mom");
        table.put(505, "Dad");

        table.remove(100);

        // different data types will have different hash codes.

        for (Integer key : table.keySet()) {
            System.out.println( key.hashCode() % 10 + "\t"+ key + "\t" + table.get(key));
        }
    }
}
