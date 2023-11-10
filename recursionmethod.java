public class recursionmethod {
    public static void main(String[] args){
        walk(8);
    }
    private static void walk(int steps) {

        if (steps > 2)
            return;

        System.out.println("you take steps");
    }
}
