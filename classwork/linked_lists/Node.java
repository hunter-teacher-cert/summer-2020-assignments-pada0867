import java.io.*;
import java.util.*;

public class Node{ //this is the class of Nodes. All nodes will have the attributes of data and next (the Node they point to next!)

  public String data;
  private Node next;

  public Node(String data, Node next){
    this.data = data;
    this.next = next;
  }

  public Node(String data){
    this.data = data;
    this.next = null;
  }

  public Node(){
    this.data = "";
    this.next = null;
  }

  public void setData(String data){
this.data = data;
  }

  public void setNext(Node next){
this.next = next;
  }
  public String getData(){
return data;
  }
  public Node getNext(){
return next;
  }

  public String toString(){
return this.data;
  }
}
