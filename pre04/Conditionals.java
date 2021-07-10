import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Conditionals {

  public static void song(int beers){
    System.out.println(beers + " bottles of beer on the wall,");
    System.out.println(beers + " bottles of beer!");
    System.out.println("Ya take one down, ya pass it around,");
    beers = beers - 1;
    System.out.println(beers + " bottles of beer on the wall!");
    if (beers>=1){
      song(beers);
    }
    if (beers==0){
      System.out.println("No bottles of beer on the wall,");
      System.out.println("no bottles of beer,");
      System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
      System.out.println("’cause there are no more bottles of beer on the wall!");
    }
  }

  public static void main(String[] args){
    System.out.println("Let's see if this works!");
    Scanner in = new Scanner(System.in);
    System.out.println("How many bottles of beer would you like to start with? ");
    int beers = in.nextInt();
    song(beers);
  }
}
