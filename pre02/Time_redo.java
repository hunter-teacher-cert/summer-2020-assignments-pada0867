import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Time_redo {
  public static void main(String[] args){

    int hour = 21;
    int minute = 30;
    int second = 30;
    int hourNow = 22;
    int minuteNow = 45;
    int secondNow = 45;
    double dblHour = 19.0;
    double dblMinute = 30.0;
    double dblSecond = 30.0;
    double secondsInDay = 24.0*3600.0;
    double totalSeconds = hour*3600.0+minute*60.0+second;
    double pctDayPassed = totalSeconds/secondsInDay;

    System.out.println("The time is now: " + hour + ":" + minute + ":" + second);
    System.out.println("The number of seconds since midnight is: " + totalSeconds);
    System.out.println("The number of seconds remaining in the day are: " + (secondsInDay-totalSeconds));
    System.out.println(pctDayPassed + "% of the day has passed.");
    System.out.println("The amount of time that has passed since I started this is: " + (hourNow-hour) + " hours " + (minuteNow - minute) + " minutes " + " and " + (secondNow-second) + " seconds.");
  }
}
