import java.lang.Math;
import java.io.*;
import java.util.*;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.print("Give me a number plz. ");
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    System.out.print("Give me another number plz. ");
    int n = in.nextInt();
    power(x,n);
    }

  public static double power(double x, int n){
    double num = 1;
    int i = 1;
    while(i < n) {
      num *= x;
      i++;
    }
  return num;
}
}
