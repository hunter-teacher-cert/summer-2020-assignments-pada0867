import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Guess_my_number_redo {
  public static void main(String[] args){
    // pick a random number
    Random random = new Random();
    int magic_number = random.nextInt(100) + 1;
    System.out.println("I'm thinking of a number between 0 and 100. Try to guess it!");
    Scanner in = new Scanner(System.in);
    int guess = in.nextInt();
    System.out.println("You guessed " + guess + ".");
    System.out.println("...but the magic number is " + magic_number + ".");
    System.out.println("You were off by " + (magic_number-guess));
  }
}
