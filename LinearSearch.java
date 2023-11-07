public class LinearSearch {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6,7,8,9,10};
        int index = linearSearch(array, 10);
        
// linear search = we iterate through collection one element at a time

        if(index != -1){
            System.out.println("Element found at index: " + index);
        }
        else {
            System.out.println("Element not found");
        }
    }
    private static int linearSearch(int[] array, int value) {
        for (int i =0; i<array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
}
