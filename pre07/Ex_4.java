import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.Random;

public class Ex_4 {
  public static void main(String[] args) {
    //largest(new int []{1,10,50,20,5}); //calls the fuction to find the largest value in a new arrary
    int [] array_1 = new int[] {1,10,50,20,5};

    int largestNumber = 0;
    int i = 0;
    largestNumber = largest(array_1,largestNumber);
    System.out.println("The largest element is " + largestNumber);

  }

  public static int largest(int [] array_1, int largestNumber){
    int counter = 0;
    for (int i = 0; i < array_1.length; i++) {
      if (array_1[i] > counter)	{
        counter = array_1[i];
  			largestNumber = i;
        }
      }
      return largestNumber;
  }
}
