import java.io.*;
import java.util.*;


public class SuperArray {
  private int[] data;
  private int numberElements;

  public SuperArray(){
    this.numberElements = 0;
    this.data = new int[10];
    }

  public SuperArray(int n){
    this.data = new int[n];
    this.numberElements = 0; //this is a marker that tells where we are in the array
    }

  public void add(int value){
    if (numberElements <= this.data.length){
      this.data[numberElements] = value;
      this.numberElements++;
    }
    if (numberElements==this.data.length){
      this.grow(value);
    }
  }

  public int get(int index){
    if (index<this.data.length){
      return this.data[index];
    }
    else{
      return -1;
    }
  }

  public boolean isEmpty(int[] x){
    int sum = 0;
    for (int i = 0;i<x.length;i++){
      sum+=x[i];
    }
    if (sum==0){
      return true;
    }
    else{
      return false;
    }
  }

  public void toString(int[]x){
    System.out.println(Arrays.toString(x));
  }

  public void grow(int n){
    int[] new_array = new int[this.data.length+1]; //adds one extra index to the new array
    for (int i=0; i<this.data.length;i++){
      new_array[i]=this.data[i];
    }
    
    this.data = new_array;



  }

  public static void main(String[] args){
    SuperArray array_1 = new SuperArray();
    array_1.add(1);
    array_1.add(2);
    array_1.add(3);
    array_1.add(4);
    array_1.add(5);
    array_1.add(6);
    array_1.add(7);
    array_1.add(8);
    array_1.add(9);
    array_1.add(10);
    array_1.add(11);

    boolean one = array_1.isEmpty(array_1.data); //array_1 is using the method isEmpty
    System.out.println(one);

    array_1.toString(array_1.data);

    //array_1.grow();

    //array_1.toString(array_1.data);


    }
}
