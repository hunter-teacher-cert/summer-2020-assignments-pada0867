import java.io.*;
import java.util.*;

public class MyStack{ //when you instantiate this class in the driver, you create a new stack object that has all the following attributes and can run the following methods

  private MyStackNode head; //when you make a new stack, the stack will automatically come with a head Node and a size
  private int size;

  public MyStack(){ //stack constructor - creates a head node that is null (has no value). The head is the very end of the stack.
    head = null;
    size = 0;
  }

  public boolean isEmpty(){
    return head==null;
  }

  public int size(){
    return size;
  }

  public String pop(){
    String popped = head.getData();
    head = head.getNext();
    size-=1;
    return popped;
  }

  //returns the data of the first node
  public String top(){
    return head.getData();
  }

  // adds a new node to the beginning of a stack
  public void push(String data){
    MyStackNode new_node = new MyStackNode(data);
    //point the new node towards the head of the stack
    new_node.setNext(head);
    //make the new node the "head" of the stack, the next new_node will point towards this new head
    head = new_node;
    size+=1;
  }

  public String toString(){
    String s = "";
    MyStackNode temp = head;
    //this loop will iterate through the stack and print out the data that is stored in all the nodes
    while(temp != null){
    s = s + temp.getData() + "-->";
    //this moves a pointer to the next Node
    //its the same as doing i+=1 or i++ in an array (think temp+=1 or temp++)
    temp = temp.getNext();
    }
    s = s + "null";
    return s;
  }

}
