import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Craps_redo {
  public static int shoot(int dice, int diceValue){
    diceValue+=1;
    int sum = 0;
    Random random = new Random();
    for (int i = 1; i<=dice; i++){
      int dieValue = random.nextInt(diceValue);
      System.out.println("Die " + i + " rolled a " + dieValue);
      sum+=dieValue;
    }
    return sum;
  }
  public static void round(int dice){
    int roll = shoot(dice,6);
    System.out.println("You rolled a "+ roll);
    if (roll==7||roll==11){
      System.out.println("You win!");
    }
    else if (roll==2||roll==3||roll==12){
      System.out.println("Craps. You lose.");
    }
    else {
      int point = roll;
      System.out.println("The point is now " + roll);
      while(true){
        int roll_2 = shoot(dice,6);
        System.out.println("You rolled a "+ roll_2);
        if (roll_2==7){
          System.out.println("Craps. You lose.");
          break;
        }
        else if (roll_2==point){
          System.out.println("You win!");
          break;
        }
      }
    }
  }
  public static void main(String[] args){
    System.out.println();
    System.out.println("How many rounds would you like to play? ");
    Scanner in = new Scanner(System.in);
    int rounds = in.nextInt();
    System.out.println();
    System.out.println("How many dice are you shooting with? ");
    int dice = in.nextInt();
    System.out.println();
    int i = 1;
    while (i<=rounds){
      System.out.println("Round " + i);
      round(dice);
      i++;
      System.out.println();
    }
    System.out.println("Thanks for playing");
    System.out.println();
  }
}
