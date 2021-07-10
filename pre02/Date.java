import java.io.*;
import java.util.*;
public class Date {
  public static void main(String[] args){
    String day = "Monday";
    String month = "June";
    int date = 22;
    int year = 2020;
    System.out.println("American format:");
    System.out.print(day);
    System.out.print(", ");
    System.out.print(month);
    System.out.print(" ");
    System.out.print(date);
    System.out.print(", ");
    System.out.println(year);
    System.out.println("European format:");
    System.out.print(day);
    System.out.print(", ");
    System.out.print(date);
    System.out.print(" ");
    System.out.print(month);
    System.out.print(", ");
    System.out.println(year);
  }
}
