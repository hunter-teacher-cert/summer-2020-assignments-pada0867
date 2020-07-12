import java.io.*;
import java.util.*;

public class StackDriver{

  public static void main(String[] args){

    Stack stack = new Stack();
    System.out.println(stack.isEmpty());
    stack.push("A");
    stack.push("B");
    stack.push("C");
    System.out.println(stack);
    System.out.println(stack.isEmpty());
    System.out.println(stack.size());
    stack.pop();
    System.out.println(stack);
    System.out.println(stack.size());
    System.out.println(stack.top());

  }

}
