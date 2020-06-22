import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Converter {
  public static void main(String[] args){
    double celcius;
    double fahrenheit;
    double conversion = 9.0/5.0;
    double constant = 32.0;
    System.out.print("What is the temperature in Celcius? ");
    Scanner in = new Scanner(System.in);
    celcius = in.nextDouble();
    fahrenheit = celcius*conversion+constant;
    System.out.printf("%.1f C = %.1f F", celcius, fahrenheit);

  }
}
