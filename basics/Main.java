import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
  public static void main(String[] args) {
//    System.out.println("Calling Pluralize");

//    String word1 = "dog";
//    int word1Count = 1;
//    System.out.println("I own " + word1Count + " " + pluralize(word1, word1Count) + ".");
//
//    String word2 = "cat";
//    int word2Count = 2;
//    System.out.println("I own " + word2Count + " " + pluralize(word2, word2Count) + ".");
//
//    String word3 = "turtle";
//    int word3Count = 0;
//    System.out.println("I own " + word3Count + " " + pluralize(word3, word3Count) + ".");
//
    System.out.println("Calling Flip N Heads");
    flipNHeads(1);
//
//    System.out.println("Calling Clock");
//    clock();
  }

  public static String pluralize(String word, int num){
    return num > 1 || num == 0 ? word + "s" : word;
  }

  public static void flipNHeads(int n){
    int numberOfHeads = 1;
    if(n == 1) numberOfHeads = 0;
    int numberOfFlips = 0;
    boolean prevFlipWasHeads = false;

    while(numberOfHeads != n){
      numberOfFlips++;
      double randomNum = random(0, 1);

      if(randomNum < 0.5){
        System.out.println("tails");
        prevFlipWasHeads = false;
      } else {
        System.out.println("heads");
        if(n == 1) numberOfHeads++;
        if(prevFlipWasHeads == true) numberOfHeads++;
        prevFlipWasHeads = true;
      }

    }

    System.out.println("It took " + numberOfFlips + " to flip " + n + " heads in a row.");
  }

  //generates a number between 0 and 1
  public static double random(int min, int max){
    return (double)(Math.random() * (max - min));
  }

//  public static void clock(){
//    Timer myTimer = new Timer();
//    TimerTask task = new TimerTask(){
//      LocalDateTime now = LocalDateTime.now();
//      String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
//      System.out.println(time);
//    }
//  }
}