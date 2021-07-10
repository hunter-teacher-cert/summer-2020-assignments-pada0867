import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Arrays_redo {

  //Methods for Exercise 4: indexOfMax:

  public static int[] makeRandomArray(int elements){
    Random randm = new Random(); // creating Random object
    int[] array_5 = new int[elements];
    for (int e = 0; e < array_5.length; e++) {
      array_5[e] = randm.nextInt(101); // storing random integers in an array. Numbers range from 0-100
    }
    return array_5;
  }

  public static int indexOfMax(int[]array_5){
    int max= 0;
    int maxIndex = 0;
    for (int f = 0; f<array_5.length; f++){
      if (array_5[f]>max){
        max=array_5[f];
        maxIndex = f;
      }
    }
    return maxIndex;
  }

  public static int largestNumber(int[]array_5){
    int max = 0;
    for (int f = 0; f<array_5.length; f++){
      if (array_5[f]>max){
        max=array_5[f];
      }
    }
    return max;
  }

  //Methods for Exercise 1.2:

  public static int[] makeScoresArray(int scores){
    Random randm = new Random(); // creating Random object
    int[] array_4 = new int[scores];
    for (int d = 0; d < array_4.length; d++) {
      array_4[d] = randm.nextInt(101); // storing random integers in an array. Numbers range from 0-100
    }
    return array_4;
  }

  public static int inRange(int [] array_4, int low, int high){
    int count = 0;
    for (int c = 0; c < array_4.length; c++){
      if (array_4[c]>=low && array_4[c]<high){
        count++;
      }
    }
    return count;
  }

  public static int classAvg(int[] array_4, int scores){
    int total = 0;
    for (int d=0; d<array_4.length; d++){
      total+=array_4[d];
    }
    int avg = total/scores;
    return avg;
  }

  //Method for Exercise 1: powArray:

  public static double[] powArray(double[]array_1,double exp){
    double[]array_2=new double[5];
    for (int a=0;a<array_1.length;a++){
      array_2[a]=Math.pow(array_1[a],exp);
    }
    return array_2;
  }

  public static void main(String[] args){

    //Main for exercise 4: indexOfMax:

    System.out.println();
    System.out.print("How many elements will be in this array? ");
    Scanner in = new Scanner(System.in);
    int elements = in.nextInt();
    int [] array_5 = makeRandomArray(elements);
    System.out.println();
    System.out.println("Here is the new array: " + Arrays.toString(array_5));
    System.out.println();
    int max = largestNumber(array_5);
    int maxIndex = indexOfMax(array_5);
    System.out.println("The largest number in this array is " + max + " and it has an index of " + maxIndex);
    System.out.println();

    /*
    Main for exercise 1.2: Creating an array of rando numbers, counting the frequency of a number that falls in a range, and calculating an average of the array:

    System.out.println();
    System.out.print("How many scores will be in this array? ");
    Scanner in = new Scanner(System.in);
    int scores = in.nextInt();
    int [] array_4 = makeScoresArray(scores);
    System.out.println();
    System.out.println("Here are the exam scores: " + Arrays.toString(array_4));
    System.out.println();
    int firstRange = inRange(array_4,90,100);
    System.out.println("Scores ranging from 90-100: "+ firstRange);
    int secondRange = inRange(array_4,80,90);
    System.out.println("Scores ranging from 80-90: "+ secondRange);
    int thirdRange = inRange(array_4,70,80);
    System.out.println("Scores ranging from 70-80: "+ thirdRange);
    int fourthRange = inRange(array_4,60,70);
    System.out.println("Scores ranging from 60-70: "+ fourthRange);
    int fifthRange = inRange(array_4,0,60);
    System.out.println("Scores ranging from 0-60: "+ fifthRange);
    System.out.println();
    int avg = classAvg(array_4, scores);
    System.out.println("The class average is: " + avg);
    System.out.println();
    */

    /*
    Main for exercise 1.1: writing a powArray method that takes an array and raises each element to a given power.

    double[]array_1=new double[]{1,2,3,4,5};
    System.out.println(Arrays.toString(array_1));
    System.out.print("What number should each element in the array be raised to? ");
    Scanner in = new Scanner(System.in);
    double exp = in.nextDouble();
    double[] array_3=powArray(array_1,exp);
    System.out.println(Arrays.toString(array_3));
    */

  }
}
