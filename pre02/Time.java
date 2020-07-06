import java.io.*;
import java.util.*;
public class Time {
  public static void main(String[] args){
    int hours = 10;
    int minutes = 05;
    int seconds = 00;
    double total_seconds_day = 24 * 60 * 60;
    double total_seconds = (hours * 60 * 60) + (minutes * 60) + seconds;
    double percent;
    int hours_2 = 21;
    int minutes_2 = 15;
    int seconds_2 = 27;
    double total_seconds_2 = (hours_2 * 60 * 60) + (minutes_2 * 60) + seconds_2;
    double elapsed = total_seconds_2 - total_seconds;



    System.out.println(total_seconds_day +  " seconds since midnight");
    System.out.println("The time is now : ");
    System.out.println(hours + " : " + minutes + " : " + seconds);
    System.out.println(total_seconds +  "  seconds today");
    percent = (total_seconds / total_seconds_day) * 100;
    System.out.println("This is " + percent  +  " % of the day");
    System.out.println("Time  now is : ");
    System.out.println(hours + " : " + minutes + " : " + seconds);
    System.out.println("There has been " + elapsed +  "  seconds elapsed");
  }
}
