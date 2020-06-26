import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.Random;

public class Ex_1 {
  public static void main(String[] args) {
    //powArray(new double []{1,2,3,4,5}, 2); // A new array and a power are passed as arguments to the 'powArray' method
    //System.out.println(newArray);
    double [] original = new double[] {1,10,50,20,5};
    double [] newArray;
    int power = 2;
    newArray = powArray(original,power);
    System.out.println(Arrays.toString(newArray));
  }



  public static double [] powArray(double [] original, double power){
    double [] newArray = new double [original.length];
    for (int i=0;i<newArray.length;i++){
      newArray[i] = Math.pow(original[i],power);
    }
    return newArray;
    //System.out.println(Arrays.toString(newArray));
    //I don't know how to display the new Array!
  }

}
