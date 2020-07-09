import java.io.*;
import java.util.*;

public class LLD{

  public static void main(String[] args){

    LL ll_one = new LL();

    System.out.println(ll_one.isEmpty());
    ll_one.add("Jack");
    ll_one.add("Chris");
    ll_one.add("Margot");
    ll_one.add("Price");
    System.out.println(ll_one);
    ll_one.insert("X",4);
    System.out.println(ll_one);
    ll_one.remove(0);
    System.out.println(ll_one);
    ll_one.remove(3);
    System.out.println(ll_one);
    ll_one.set("Versa",1);
    System.out.println(ll_one);
    System.out.println(ll_one.length());
    System.out.println(ll_one.isEmpty());
    ll_one.getData(10);




/* making Nodes "by hand" and linking them together manually

    Node n1 = new Node("Tim"); //makes new node objects
    Node n2 = new Node("Dave");
    Node n3 = new Node("Jim");
    Node n4 = new Node("Jack");
    Node n5 = new Node("Jasmine");


    n1.setNext(n2);
    n2.setNext(n3);
    System.out.println(n1.getData());
    System.out.println(n1.getNext());
    System.out.println(n1.getNext().getNext()); //This will print the list Tim, Dave, Jim
    System.out.println("~~~~~~~~~~~~~~~~~~");
    n1.setNext(n4);//this adds the node Jack between Tim and Dave to make the new list of Tim, Jack, Dave, Jim
    n4.setNext(n2);
    System.out.println(n1.getData());
    System.out.println(n1.getNext());
    System.out.println(n1.getNext().getNext());
    System.out.println(n1.getNext().getNext().getNext());

*/

  }
}
