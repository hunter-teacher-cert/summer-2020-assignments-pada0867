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

  public static void sort(ArrayList list){
    int index_smallest;
    int value_smallest;
    int value_first;
    for (int i = 0; i<list.size()-1; i++){
      index_smallest = findSmallest(list,i,list.size()-1);// finds the index of the smallest value
      value_smallest = (int)list.get(index_smallest);// sets variable smallest to the VALUE of the smallest element
      value_first = (int)list.get(i);
      list.set(i,value_smallest);
      list.set(index_smallest,value_first);
    }
  }

  //##################################################
  //##################################################

  //return ArrayList of random ints, sorted in ascending order
  public static ArrayList prestoSortedArrayListo(int numItems, int lo, int hi){
    ArrayList retArr = new ArrayList();

    //if requested, return empty ArrayList
    if ( numItems<1 )
      return retArr;

    //populate index 0
    retArr.add( (int)(lo * Math.random()) );

    //populate rest of indices, each one greater than last
    for(int i=1; i<numItems; i++) {
      //System.out.println(i);  //diagnostic under-the-hood view
      //retArr.add( Math.random() ); // [0,1)
      //retArr.add( (int)Math.random() ); // 0
      retArr.add( (int)(hi * Math.random()) ); // [0,hi)
      //retArr.add( lo + (int)(hi * Math.random()) ); // [lo,lo+hi)
      //System.out.println(retArr.get(i-1));
      //retArr.add( (int)retArr.get(i-1) + lo + (int)(hi * Math.random()) ); // ["left neighbour",hi)
    }

    return retArr;
  }//end prestoSortedArrayListo()

  //##################################################
  //##################################################

  public static void main( String[] args ){

    System.out.println("\n"+"Test list"+":");
    //ArrayList sal01 = prestoSortedArrayListo(10,0,20);
    ArrayList testList = prestoArrayListo(10,0,20);
    System.out.println(testList);
    //System.out.println(linSearch(sal01,3));
    //System.out.println(binSearchRec(sal000,3));
    //System.out.println(binSearch(sal01,3));
    //int smallest = findSmallest(testList,0,testList.size()-1);
    //System.out.println(smallest);
    sort(testList);
    System.out.println(testList);

  }//end main

}//end class
