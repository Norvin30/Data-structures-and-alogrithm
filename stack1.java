import java.util.Stack;

public class stack1 {
public static void main(String[] args){
    Stack<String> stack = new Stack<String>();

    System.out.println(stack.empty());
    // output will be true as the stack is empty.

    stack.push("10");
    stack.push("20");
    stack.push("30");
    stack.push("40");
    stack.push("50");
    stack.push("60");



    System.out.println(stack.peek());
    //by peek() we will be able to find the top most element of a stack.Output will be 60

    System.out.println(stack.search("30"));
    // by search we can find any element in the stack.Output will be 4.

    System.out.println(stack.search(70));
    // output will be -1 as the element searched is not in the stack.

    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();

    String mygame = stack.pop();

    //the first element to be removed would be 60 as stack follows LIFO pattern then 50,40,30 and so on would be removed if pop() operation is used
   // the element 20 will also be not printed in the stack list as i have assigned it to String mygame.

    System.out.println(stack);
    // output will be 10.

    System.out.println(mygame);
    //output will be 20.

}
}
