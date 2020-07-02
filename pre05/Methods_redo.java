import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Methods_redo {

  public static int ack(int m, int n){
    //int value = m+n;
    //return value;
    if (m==0){
      return (n+1);
    }
    else if ((m>0) && (n==0)){
      return ack(m-1,1);
    }
    else if ((m>0) && (n>0)){
      return ack(m-1,ack(m,n-1));
    }
    else { //Am I not allowed to put anything here for the 'else' like I can other conditional statements?
      return 0;
    }
}

  public static boolean triangle(int a, int b, int c){
    if ((a+b>c)&&(a+c>b)&&(b+c>a)){
      return true;
    }
    else {
      return false;
    }
  }

  public static void main(String[] args){
    System.out.println("Let's run the Ackerman function!");
    Scanner in = new Scanner(System.in);
    System.out.println("What is the value of m? ");
    int m = in.nextInt();
    System.out.println("What is the value of n? ");
    int n = in.nextInt();
    int value = ack(m,n);
    System.out.println(value);
    System.out.println("Can it form a triangle?");
    System.out.println("What is the length of side a? ");
    int a = in.nextInt();
    System.out.println("What is the length of side b? ");
    int b = in.nextInt();
    System.out.println("What is the length of side c? ");
    int c = in.nextInt();
    boolean true_or_false = triangle(a,b,c);
    System.out.println(true_or_false);
  }

}
