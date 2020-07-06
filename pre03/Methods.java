import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Methods {

  int age = 30;
  
  public static void zoo1(int age, String pet, String street){ //need to define the types of arguments are being passed to the method
    System.out.println("You are " + age + " years old, your first pet was named " + pet + ", and you grew up on " + street + "Road/Street.");
  }

  public static void height(String feet, int inches){
    System.out.println("You are " + feet + " and " + inches + " inches tall.");
  }
  public static void main(String[] args){// Need to do inputs here in the main because this information needs to be gathered BEFORE it is passed to the method.
    // Gathering input from the user:
    System.out.println("Let's see if this works!");
    Scanner in = new Scanner(System.in);
    System.out.println("How old are you? ");
    int age = in.nextInt();
    System.out.println("What was the name of your first pet? ");
    String pet = in.next();
    System.out.println("What street did you grow up on? ");
    String street = in.next();

    //Calling the methods:
    zoo1(age, pet, street);
    height("five",6); //You didn't need to define the string 'feet' here in the main, you can just pass it.
  }
}

//Need to define the variable types in the main AND in the method if you want to use inputs
