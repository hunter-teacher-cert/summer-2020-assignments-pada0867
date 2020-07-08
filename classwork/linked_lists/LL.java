import java.io.*;
import java.util.*;

public class LL{ //when you instantiate this class in the driver, you create a new linked list object that has all the following attributes and can run the following methods

  private Node head; //when you make a new linked list, the list will automatically come with a head Node

  public LL(){ //linked list constructor - creates a head node that is null (has no value). The head is the very end of the list.
    head = null;
  }

  // tests to see if a list is empty. If empty returns true, if filled returns false.
  public boolean isEmpty(){
    if(head==null){ //checks to see if the first
      return true;
    }
    else{
      return false;
    }
  }

  //returns the data at a specified index

  public String getData(int index){
    Node current = head;
    int count = 0;

    while(current!=null){
      if (count == index){
        return current.data;
      }
      current = current.getNext();
      count++;
    }
    return "N/A";
  }

  // adds a new node to the beginning of a linked list
  public void add(String data){
    Node new_node = new Node(data);

    //point the new node towards the head of the list
    new_node.setNext(head);

    //make the new node the "head" of the list, the next new_node will point towards this new head
    head = new_node;
  }

  //prints out all the nodes of a linked list
  public String toString(){
    String s = "";
    Node temp = head;
    temp = head;

    //this loop will iterate through the linked list and print out the data that is stored in all the nodes
    while(temp != null){
    s = s + temp.getData() + "-->";
    //this moves a pointer to the next Node
    //its the same as doing i+=1 or i++ in a regular array (think temp+=1 or temp++)
    temp = temp.getNext();
    }
    s = s + "null";
    return s;
  }
}
