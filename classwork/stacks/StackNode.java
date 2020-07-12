import java.io.*;
import java.util.*;

public class StackNode{ //this is the class of Nodes. All nodes will have the attributes of data and next (the Node they point to next!)

  private String data;
  private StackNode next;

  public StackNode(String data, StackNode next){
    this.data = data;
    this.next = next;
  }

  public StackNode(String data){
    this.data = data;
    this.next = null;
  }

  public StackNode(){
    this.data = "";
    this.next = null;
  }

  public void setData(String data){
    this.data = data;
  }

  public void setNext(StackNode next){
    this.next = next;
  }
  public String getData(){
    return data;
  }
  public StackNode getNext(){
    return next;
  }

  public String toString(){
    return this.data;
  }
}
