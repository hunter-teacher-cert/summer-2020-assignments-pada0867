import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Methods {

  public static void main(String[] args) {
    System.out.print("Which program would you like to run? 1,2, or 3? Program 1 will tell you if two numbers are divisible, and program 2 will tell you if 3 numbers can make a triangle. ");
    Scanner in = new Scanner(System.in);
    int answer = in.nextInt();
    if (answer == 1){
      program_1();
    }
    if (answer == 2){
    program_2();
    }
    if (answer == 3){
    System.out.println("You chose 3");
    }
  }

//Are these numbers divisible? (Exercise 2)
	public static void program_1() {
		System.out.print("Give me a number plz. ");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
		System.out.print("Give me another number plz. ");
    int m = in.nextInt();
    if (n%m == 0){
      System.out.println("These two numbers are divisible and have a remainder of " + n%m + ".");
    }
    if (n%m != 0){
      System.out.println("These two numbers are not divisible and have a remainder of " + n%m + ".");
    }

	}

  //Is it a triangle? (Exercise 3)
  public static void program_2(){
    System.out.println("Let's see if three numbers will make a triangle.");
    System.out.print("Give me a number. This will be side one of the triangle. ");
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    System.out.print("Give me another number. This will be side 2. ");
    int b = in.nextInt();
    System.out.print("Give me another number. This will be side 3. ");
    int c = in.nextInt();
    if ((a < b + c) && (b < a + c) && (c < a + b)) {
      System.out.print("These numbers can make a triangle. ");
  		}
    if ((a > b + c) || (b > a + c) || (c > a + b)) {
      System.out.println("These numbers cannot make a triangle.");
    }
  }

}
