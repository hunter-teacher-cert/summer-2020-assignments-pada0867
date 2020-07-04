import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Loops_redo{


// Method for exercise 2: square root function the old fashioned way
  public static double squareRoot(double a){
    double b = a/2;
    double c = a/2;
    double diff;
    do {
      c=b;
      b = (c+(a/c))/2;
      diff = Math.abs(c-b);
    } while (diff>0.000001);
    return b;
}


/* Method for exercise 4:

  public static int fact(int n){
    int answer = 1;
    for (int i = n;i>0;i--){
      answer = answer*i;
    }
    return answer;
  }

//3! = (3)*(2)*(1)

//the number of times the loop runs is the same as the factorial number
//the number of times the loop runs will be called i

*/

  public static void main(String[] args){

    //Exercise 2: Square root function the old fashioned way!
    System.out.println("Let's run the square root function!");
    Scanner in = new Scanner(System.in);
    System.out.println("What number would you like to find the square root of? ");
    double a = in.nextDouble();
    double answer = squareRoot(a);
    System.out.println(answer);


    /*

    //Exercise 3: Really struggled with a way to use the Math.pow() method in a loop:

    System.out.println("Let's run the power function!");
    Scanner in = new Scanner(System.in);
    System.out.println("What is the value of x (this will be the base)? ");
    int x = in.nextInt();
    System.out.println("What is the highest value of y (this will be the highest exponent that the base is raised to)? ");
    int exp = in.nextInt();
    int i = 1;
    int y = 1;
    while ((i <= y)&&(y<=exp)){
      System.out.println(Math.pow(x,y));
      i++;
      y++;
    }
    System.out.println();

    //Exercise 4: Factorial method:

    System.out.println("Let's run the factorial function!");
    System.out.println("What number would you like to find the factorial of? ");
    int n = in.nextInt();
    int answer = fact(n);
    System.out.println("The factorial of " + n + " is: " + answer);

    */
  }
}
