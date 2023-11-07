import java.util.Arrays;
import static java.util.Arrays.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int array[] = new int[100];
        int target = 42;

        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }
        //int index = Arrays.binarySearch(array, target);
        int index = binarySearch(array, target);

        if(index == -1){
            System.out.println(target + "not found");
        }
        else {
            System.out.println( "Element  found at: " + index);

        }
    }
}
