import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.Random;

public class Craps {
  public static void main(String[] args) {
    int Sum_1;
    Sum_1 = Shoot();
    System.out.println("You rolled a " + Sum_1);
    //String Outcome;
    //Outcome = Round(Sum_1);
    if (Sum_1 == 2 || Sum_1 == 3 || Sum_1 == 12){
      System.out.println("That's Craps! You lose!");
    }
    if (Sum_1 == 7 || Sum_1 == 11 || Sum_1 == 12){
      System.out.println("That's a Natural! You win!");
    }
    if (Sum_1 == 1 || Sum_1 == 4|| Sum_1 == 5 || Sum_1 == 6 || Sum_1 == 8 || Sum_1 == 9 || Sum_1 == 10){
      System.out.println("Point is " + Sum_1 + ". You get to keep rolling.");
      int Sum_2;
      while (true){
        Sum_2 = Shoot();
        if (Sum_2 == Sum_1){
          System.out.println("You win!");
          break;
          }
        if (Sum_2 == 7){
          System.out.println("You lose!");
          break;
          }
      }
    }
  }

  public static int Shoot(){
    Random rand = new Random();
    int die_1 = rand.nextInt(7);
    int die_2 = rand.nextInt(7);
    System.out.println("Die 1 is " + die_1);
    System.out.println("Die 2 is " + die_2);
    int Sum = die_1 + die_2;
    return Sum;
    }
  }
