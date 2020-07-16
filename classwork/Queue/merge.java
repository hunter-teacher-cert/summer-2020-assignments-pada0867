
import java.io.*;
import java.util.*;

public class merge {

  public static ArrayList prestoArrayListo(int numItems, int lo, int hi){
    ArrayList retArr = new ArrayList();

    for(int i=0; i<numItems; i++) {
      //System.out.println(i);  //diagnostic under-the-hood view
      //retArr.add( Math.random() ); // [0,1)
      //retArr.add( (int)Math.random() ); // 0
      retArr.add( (int)(hi * Math.random()) ); // [0,hi)
      //retArr.add( lo + (int)(hi * Math.random()) ); // [lo,lo+hi)
    }
    return retArr;
  }//end prestoArrayListo()

  //##################################################
  //##################################################

  public static void swapSort(ArrayList list){ // this is known as a "sort in place" method
    // if you don't specify that the incoming array is <Integer>,
    //then you need to specify (int) later when
    //using get: (int)list.get(i)
    int index_smallest;
    int value_smallest;
    int value_first;
    int high = list.size()-1;
    for (int i = 0; i<high; i++){
      index_smallest = findSmallest(list,i,high);// BIG UPS TO KEN!
      value_smallest = (int)list.get(index_smallest);// sets variable smallest to the VALUE of the smallest element
      value_first = (int)list.get(i);
      list.set(i,value_smallest);
      list.set(index_smallest,value_first);
    }
  }

    //##################################################
    //##################################################

  //returns a sublist of al containing the elements at indices in the range [lo, hi)
  public static ArrayList<Integer> slice(ArrayList<Integer> al, int lo, int hi) {

    ArrayList<Integer> sub = new ArrayList<Integer>();
    for (; lo < hi; lo++) {
      sub.add( al.get(lo) );
    }//copy
    return sub;
  }//slice

  //##################################################
  //##################################################

  public static ArrayList merge(ArrayList <Integer> a, ArrayList<Integer> b){
    ArrayList a_sorted_list = new ArrayList();
    int index_a = 0;
    int index_b = 0;

    while (index_a<a.size() && index_b<b.size()){
      if (a.get(index_a)<b.get(index_b)){
        a_sorted_list.add(a.get(index_a));
        index_a++;
      }
      else{
        a_sorted_list.add(b.get(index_b));
        index_b++;
      }
    }
    if (index_a==a.size()){
      while(index_b<b.size()){
        a_sorted_list.add(b.get(index_b));
        index_b++;
      }
    }
    else {
      while(index_a<a.size()){
        a_sorted_list.add(a.get(index_a));
        index_a++;
      }
    }
    return a_sorted_list;
  }

  //##################################################
  //##################################################

  public static void main( String[] args ){

    //testing the 'slice' and 'merge' methods
    ArrayList list_1 = prestoArrayListo(10,0,100);
    //ArrayList list_2 = prestoArrayListo(5,0,10);
    swapSort(list_1);
    //swapSort(list_2);
    System.out.println(list_1);
    ArrayList sliced_1 = slice(list_1,0,5);
    ArrayList sliced_2 = slice(list_1,5,10);
    System.out.println(sliced_1);
    System.out.println(sliced_2);
    ArrayList <Integer> sorted = merge(sliced_1,sliced_2);
    System.out.println(sorted);

  }//end main

}//end class
