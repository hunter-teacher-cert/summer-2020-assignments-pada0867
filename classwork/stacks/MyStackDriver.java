import java.io.*;
import java.util.*;

public class MyStackDriver{

  public static void main(String[] args){

    MyStack stack = new MyStack();
    System.out.println(stack.isEmpty());
    stack.push("A");
    stack.push("B");
    stack.push("C");
    System.out.println(stack);
    System.out.println(stack.isEmpty());
    System.out.println(stack.size());
    System.out.println(stack.pop());
    System.out.println(stack);
    System.out.println(stack.size());
    System.out.println(stack.top());

  }

}
