import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class make_a_table {


//This method makes a single row:
  public static void printRow(int n, int cols) {
    int i = 1;// this is the value that each row starts at
    while (i <= cols){
      System.out.printf("%4d", n * i);
      i = i + 1;
    }
    System.out.println();
  }

  public static void makeTable(int rows,int cols){
    //This method makes the rows by printing by calling the printRow function and then printing it on another line every time:
        int i = 1;
        while (i<=rows){
          printRow(i,cols);
          i = i+1;
        }
  }

//The main method calls the row method 10 times and prints it out on a new line every time:
  public static void main(String[] args){


    makeTable(5,5);//makes a table of defined #rows and #columns


  }
}
