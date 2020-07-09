import java.io.*;
import java.util.*;

public class LL{ //when you instantiate this class in the driver, you create a new linked list object that has all the following attributes and can run the following methods

  private Node head; //when you make a new linked list, the list will automatically come with a head Node
  private int length;

  public LL(){ //linked list constructor - creates a head node that is null (has no value). The head is the very end of the list.
    head = null;
    length = 0;
  }

  // tests to see if a list is empty. If empty returns true, if filled returns false.
  public boolean isEmpty(){
    return head==null;
  }

  public int length(){
    return length;
  }

  //inserts data at specified index
  public void insert(String data, int index){
    if (index>length || index < 0){
      throw new IndexOutOfBoundsException();
    }
    if (data==null){
      throw new IllegalArgumentException();
    }
    Node new_node = new Node(data);
    Node temp = head;
    int count = 0;
    if (index==0){
      add(data);
    }
    else{
      index-=1;
      while(temp!=null){
        if(count == index){
          new_node.setNext(temp.getNext());
          temp.setNext(new_node);
          length+=1;
        }
        count++;
        temp = temp.getNext();
      }
    }
  }

// this remove method traverses the linked list until it arrives at the node precedining
// the node I want to remove. It then sets the preceding node's 'next' to the
// node that is two away in the list. It forms a link that goes around the
// node we want to remove. Really the node we want to remove isn't REALLY
// removed, the preceding node steps around it.
  public void remove(int index){
    if (index>length || index < 0){
      throw new IndexOutOfBoundsException();
    }
    Node temp = head;
    int count = 0;
    if (index==0){
      head = head.getNext();
      length-=1;
    }
    else{
      index-=1;
      while(temp!=null){
        if(count == index){
          temp.setNext(temp.getNext().getNext());
          length-=1;
        }
        count++;
        temp = temp.getNext();
        }
      }
    }

  //returns the data at a specified index
  public String getData(int index){
    if (index>length || index < 0){
      throw new NoSuchElementException();
    }
    Node temp = head;
    int count = 0;
    while(temp!=null){
      if (count == index){
        return temp.data;
      }
      temp = temp.getNext();
      count++;
    }
    return null;
  }

  // adds a new node to the beginning of a linked list
  public void add(String data){
    if (data==null){
      throw new IllegalArgumentException();
    }
    Node new_node = new Node(data);
    //point the new node towards the head of the list
    new_node.setNext(head);
    //make the new node the "head" of the list, the next new_node will point towards this new head
    head = new_node;
    length+=1;
  }

  public void set(String data, int index){
    if (index>length || index < 0){
      throw new IndexOutOfBoundsException();
    }
    if (data==null){
      throw new IllegalArgumentException();
    }
    Node temp = head;
    int count = 0;
    if (index==0){
      remove(index);
      add(data);
    }
    else{
      while(temp!=null){
        if(count == index){
          remove(index);
          insert(data,index);
        }
        count++;
        temp = temp.getNext();
        }
      }
  }

  //prints out all the nodes of a linked list
  public String toString(){
    String s = "";
    Node temp = head;

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
