import java.io.*;
import java.util.*;
import java.util.Random.*;

class GOL{

  public static char[][] createNewBoard(int rows, int cols){
    char[][] board = new char[rows][cols];
  	for (int r = 0; r < rows; r++) {
      for (int c = 0; c < cols; c++) {
        board[r][c] = '-';
  	  }
    }
    int i =0;
    while(i<50){
      Random row = new Random();
      int rand_row = row.nextInt(20);
      Random col = new Random();
      int rand_col = col.nextInt(20);
      setCell(board,rand_row,rand_col,'*');
      i++;
    }
  	return board;
  }

  public static void printBoard(char[][] board){
    System.out.println();
    for (int r = 0; r < board.length; r++) {
      for (int c = 0; c < board[r].length; c++) {
        System.out.printf("%c",board[r][c]);
  	  }
  	    System.out.println();
  	}
  	System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~\n\n");
  }

  public static void setCell(char[][] board, int r, int c, char val){
    if (r>=0 && r<board.length && c>=0 && c<board[r].length){
      board[r][c] = val;
	  }
  }

  public static int countNeighbors(char[][] board, int r, int c){
    int count = 0;
    for (int a=r-1; a<=r+1; a++){ // these loops check the spaces surrounding the target space
      for(int b=c-1; b<=c+1; b++){
        if (a>=0 && b>=0 && a<board.length && b<board[0].length){
          if (!(a==r && b==c) && board[a][b]=='*'){
            count++;
          }
        }
      }
    }
    return count;
  }

  public static char getNextGenCell(char[][] board, int r, int c){
        int count = countNeighbors(board,r,c);
        if ((count==2||count==3) && board[r][c]=='*'){
          return '*';
        }
        else if (count==3 && board[r][c]=='-'){
          return '*';
        }
        else{
          return '-';
        }
      }

  public static char[][] generateNextBoard(char[][] board) {
		char[][] newBoard = new char[board.length][board[0].length]; // will store next generation board
		for (int r = 0; r < board.length; r++) {
			for (int c = 0; c < board[r].length; c++) {
				newBoard[r][c] = getNextGenCell(board, r, c);
			}
		}
    return newBoard;
  }

  public static void main(String[] args) {
    char [][] board = createNewBoard(20,20);
    printBoard(board);
    int gen = 1;
    for (int i=0; i<100;i++){
      System.out.println("Generation " + gen);
      board = generateNextBoard(board);
      printBoard(board);
      gen++;
    }
  }

}
