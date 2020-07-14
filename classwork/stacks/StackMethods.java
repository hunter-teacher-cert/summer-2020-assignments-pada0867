import java.io.*;
import java.util.*;

public class StackMethods{

  public static void main(String[] args){
    System.out.println(reverseSentence("The quick brown fox jumps over the lazy dog"));
  }

  public static String reverseWord(String word){
    String result = new String();
    Stack<Character> new_stack = new Stack<Character>();
    for (int a=0; a<word.length();a++){
      new_stack.push(word.charAt(a));
    }
    for (int b=0; b<word.length(); b++){
      result+=new_stack.pop();
    }
    return result;
  }

  public static Boolean isPalendrome(String word){
    String revWord = reverseWord(word);
    return word.equals(revWord);
  }

  public static String reverseSentence(String sentence){
    String word = "";
    String bigString = "";
    Stack<String> flapjacks = new Stack<String>();
    for (int i = 0; i<sentence.length(); i++){
      if (sentence.charAt(i) != ' '){
          word += sentence.charAt(i);
      }
      else if(sentence.charAt(i) == ' '){
        flapjacks.push(word);
        word = "";
      }
    }
    flapjacks.push(word);
    while(!flapjacks.empty()){ // ask about this and the exception 'empty stack'
      bigString += flapjacks.pop() + " " ;
    }
    return bigString;
  }

}
