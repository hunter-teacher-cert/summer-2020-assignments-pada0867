import java.io.*;
import java.util.*;


public class Time{

    //these are the instance variables (attributes of all objects in the class)
    private int hour;
    private int minute;
    private int second;

    //this is the constructor, it passes all the instance variables of the class to each object

    public Time(){

      this.hour = 0;
      this.minute = 0;
      this.second = 0;
    }

    //this is another type of constrctor that accepts parameters and passes them to objects
    public Time(int hour, int minute, int second) {
      this.hour = hour;
      this.minute = minute;
      this.second = second;
    }

    public String toString() {
      return String.format("%02d:%02d:%02d\n", this.hour, this.minute, this.second);
    }

    //this method deterines if all the attributes between two objects are the same, and then returns a true or false
    public boolean equals(Time that) {
        return this.hour == that.hour && this.minute == that.minute && this.second == that.second;
    }

    public Time add(Time x){
      Time sum = new Time();
      sum.hour = this.hour + x.hour;
      sum.minute = this.minute + x.minute;
      sum.second = this.second + x.second;

      if (sum.second >= 60) {
          sum.second -= 60;
          sum.minute += 1;
      }
      if (sum.minute >= 60) {
          sum.minute -= 60;
          sum.hour += 1;
      }
      return sum;
    }

    public int secondsDiff(Time x){
      int secondsDiff = Math.abs((this.hour-x.hour)*3600) + Math.abs((this.minute-x.minute)*60) + Math.abs(this.second-x.second);
      return secondsDiff;
    }

    public void addMinutes(int minutes){
      this.minute += minutes;
      if (this.minute>=60){
        this.hour+=1;
        this.minute = 00;
      }
      if (this.hour>12){
        this.hour=1;
      }
    }

    public static void main(String[] args){

      //this creates a new objects that belongs to the time class
      Time time_1 = new Time(12,59,00);
      Time time_2 = time_1;
      Time time_3 = new Time(9,45,35);
      Time time_4 = new Time(01,01,00);
      Time time_5 = new Time(01,00,00);

      //this invokes the printing method that will print and display an object
      String string_1 = time_1.toString();
      System.out.print(string_1);
      String string_2 = time_2.toString();
      System.out.print(string_2);

      //this will invoke the method that determines if two objects are the same
      boolean test = time_1.equals(time_2);
      System.out.println(test);

      //this invokes the method of adding two time objects together, creating a new object, and then displaying it
      Time total = time_1.add(time_2);
      String string_3 = total.toString();
      System.out.println(string_3);

      int diff = time_4.secondsDiff(time_5);
      System.out.println(diff);

      time_1.addMinutes(1);

      String string_4 = time_1.toString();
      System.out.println(string_4);






    }
}
