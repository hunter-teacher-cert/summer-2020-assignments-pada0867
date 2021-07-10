import java.io.*;
import java.util.*;


public class LifeArray{

	public static void main(String[] args){

		/* Methods:
		- colPop(int[][] a, int c, int value)
		- rowPop(int[][] a, int r, int value)
		- set(int[][] a, int value)
		- invert(int[][] a)
		- diagonal(int[][] a, int r, int c, int direction, int value)
		- printArray(int[][] a)
		*/

		int array[][] = new int[20][20];

	}// end main

  public static void colPop(int[][] a, int c, int value) {
    for (int r = 0; r<a.length; r++){
      a[r][c] = value;
    }
  }//end colPop

  public static void rowPop(int[][] a, int r, int value) {
    for (int c=0; c<a.length; c++){
      a[r][c]=value;
    }
  }//end rowPop

  public static void set(int[][] a, int value) {
    for (int r=0; r < a.length; r++){
      for (int c=0; c < a[r].length; c++){
          a[r][c]=value;
      }
    }
  }//end invert

  public static void invert(int[][] a) {
    for (int r=0; r < a.length; r++){
      for (int c=0; c < a[r].length; c++){
        if (a[r][c]==0){
          a[r][c]=999;
        }
        else{
          a[r][c]=0;
        }
      }
    }
  }//end invert

  public static void diagonal(int[][] a, int r, int c, int direction, int value) {

    /* movement codes
      0: up + left
      1: up + right
      2: down + left
      3: down + right
     */

		 if (direction==0){
       while(r>=0&&c<a.length){
             a[r][c]=value;
             r--;
             c++;
       }
     }
		 if (direction==1){
			 while(r<a.length&&c<a.length){
						 a[r][c]=value;
						 r++;
						 c++;
			 }
		 }
		 if (direction==2){
			 while(r<a.length&&c>=0){
						 a[r][c]=value;
						 r++;
						 c--;
			 }
		 }
    if (direction==3){
      while(r>=0&&c>=0){
            a[r][c]=value;
            r--;
            c--;
      }
    }
  }// end diagonal

	public static void printArray(int[][] a) {
    System.out.println();
		for (int r = 0; r < a.length; r++){
			for (int c = 0; c < a[r].length; c++) { //use a[r], since Java can have "jagged" arrays, not rectangular
				System.out.printf("%03d ", a[r][c]);
			}//end for c
			System.out.println();
		}//end for r
		System.out.println();
	}//end printArray

}//end class
