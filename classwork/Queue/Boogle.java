/**
   classwork -- Day 10 | 0b1010 | 0x0a
   class: Boogle
   A tester class for developing and testing binary search.
   Implements binary search algo on an ArrayList
   - iteratively
   - recursively
   T. Mykolyk, F. Dragon
   June 2020
**/

import java.io.*;
import java.util.*;

public class Boogle {

  //return index of first occurence of target, or -1 if not found
  public static int linSearch( ArrayList al, int target ){
    for( int pos=0; pos<al.size(); pos++) {
      if (al.get(pos).equals(target))
        return pos;
    }
    return -1;
  }//end linSearch()

  //##################################################
  //##################################################

  public static int findSmallest(ArrayList<Integer> list, int low, int high){
  // assume the first item is the smallest - call it our smallest so far
    int min = low;

    for (int i = low+1; i<=high; i++){
      if ((int)list.get(i)<(int)list.get(min)){
        min=i;
      }
    }
    return min;
  }

  //##################################################
  //##################################################

  //return index of target, or -1 if not found
  //assumes input ArrayList is sorted in ascending order
  public static int binSearch( ArrayList al, int target )
  {
    //uncomment exactly 1 of the 2 helper method calls below:

    //return binSearchIter( al, target, 0, al.size()-1 );
    return binSearchRec( al, target, 0, al.size()-1 );
  }//end binSearch()

  //##################################################
  //##################################################

  public static int binSearchIter( ArrayList al, int target,int lo, int hi ){
    int tPos = -1; //init return var to flag value -1
    int m = (lo + hi) / 2; //init mid pos var

    while( lo <= hi ) { // run until lo & hi cross
      m = (lo + hi) / 2; //update mid pos var

      // target found
      if ( (int)al.get(m) == target )
        return m;

      // value at mid index higher than target
      else if ( (int)al.get(m) > target )
        hi = m - 1; //move hi to index to left of mid

      // value at mid index lower than target
      else if ( (int)al.get(m) < target )
        lo = m + 1; //move lo to index to right of mid
    }
    return tPos;
  }//end binSearchIter()

  //##################################################
  //##################################################

  public static int binSearchRec( ArrayList al, int target, int lo, int hi ){
    int tPos = -1; //init return var to flag value -1
    int m = (lo + hi) / 2; //init mid pos var

    //exit case. If lo & hi have crossed, target not present
    if (lo > hi)
      return tPos; //-1

    // target found
    if ( (int)al.get(m) == target )
      tPos = m;

    // value at mid index higher than target
    else if ( (int)al.get(m) > target )
      tPos = binSearchRec( al, target, lo, m-1 );

    // value at mid index lower than target
    else if ( (int)al.get(m) < target )
      tPos = binSearchRec( al, target, m+1, hi );

    return tPos;
  }//end binSearchRec()

  //##################################################
  //##################################################

  //return ArrayList of random ints on range [lo,lo+hi)

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
