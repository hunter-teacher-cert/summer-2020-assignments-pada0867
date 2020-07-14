import java.io.*;
import java.util.*;

public class MyStackNode{ //this is the class of Nodes. All nodes will have the attributes of data and next

  private String data;
  private MyStackNode next;

  public MyStackNode(String data, MyStackNode next){
    this.data = data;
    this.next = next;
  }

  public MyStackNode(String data){
    this.data = data;
    this.next = null;
  }

  public MyStackNode(){
    this.data = "";
    this.next = null;
  }

  public void setData(String data){
    this.data = data;
  }

  public void setNext(MyStackNode next){
    this.next = next;
  }
  public String getData(){
    return data;
  }
  public MyStackNode getNext(){
    return next;
  }

  public String toString(){
    return this.data;
  }
}
