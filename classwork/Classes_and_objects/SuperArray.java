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

  public void add(int value, int index){
    this.numberElements++;
    if (numberElements>this.data.length){ //if the marker numberElements has become larger than the list when add is called, a new index is created
      grow();
      this.data[numberElements-1] = value;
    }
    if (index<numberElements){  //shifting everything over if we're trying to add something to the left of the numberElements marker
      int[] new_array = new int[this.data.length]; //makes a new array
      for (int i=0; i<new_array.length;i++){ //fills in the new array with the original array's information
        new_array[i]=this.data[i];
      }
      for (int i=index; i<new_array.length;i++){ //goes to the desired index of the NEW array and starts 'erasing' everything in the rest of array
        new_array[i]=0;
      }
      for (int i=index; i<new_array.length-1;i++){ //don't know why I need the -1 here! but it works ¯\_(ツ)_/¯
        new_array[i+1]=this.data[i]; //starts copying the values from the original array into the new array starting at the desired index but shifted over
      }
      this.data = new_array;
      this.data[index] = value; //places in the desired value at the desired index
    }
    else{
          this.data[index] = value;
    }

  public void grow(){
    int[] new_array = new int[this.data.length+1]; //adds one extra index to the new array
    for (int i=0; i<this.data.length;i++){
      new_array[i]=this.data[i];
    }
    this.data = new_array;
  }

  public void remove(int index){
    this.data[index]=0;
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

  public static void main(String[] args){

    SuperArray array_1 = new SuperArray();

    array_1.add(1,0);
    array_1.add(2,1);
    array_1.add(3,2);
    array_1.add(4,3);
    array_1.add(5,4);
    array_1.add(6,5);
    array_1.add(7,6);
    array_1.add(8,7);
    array_1.add(9,8);
    array_1.add(10,9);

    array_1.toString(array_1.data);

    //testing out the new add method
    //array_1.add(11,10); //works when trying to add something at a new index that is beyond the length of the array
    //array_1.add(100,4); //adding elements to an occupid index
    //array_1.add(100,8);
    
    array_1.toString(array_1.data);

    }
}
