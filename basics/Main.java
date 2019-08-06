import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
  public static void main(String[] args) {
    System.out.println("Calling Pluralize");

    String word1 = "dog";
    int word1Count = 1;
    System.out.println("I own " + word1Count + " " + pluralize(word1, word1Count) + ".");

    String word2 = "cat";
    int word2Count = 2;
    System.out.println("I own " + word2Count + " " + pluralize(word2, word2Count) + ".");

    String word3 = "turtle";
    int word3Count = 0;
    System.out.println("I own " + word3Count + " " + pluralize(word3, word3Count) + ".");

    System.out.println("Calling Flip N Heads");
    flipNHeads(1);
    flipNHeads(2);

    System.out.println("Calling Clock");
    Main clockMethod = new Main();
    clockMethod.clock();
  }

  //takes in a string and makes it plural if the number is larger than 1 or is equal to 0
  public static String pluralize(String word, int num){
    return num > 1 || num == 0 ? word + "s" : word;
  }

  //takes in the number of heads in a row and determines how many flips it took to get there
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
  //used in the flipNHeads method
  public static double random(int min, int max){
    return (double)(Math.random() * (max - min));
  }

  //Timer obj to be used to print the time at every second
  Timer clockTimer = new Timer();

  //TimerTask obj that prints the time
  TimerTask task = new TimerTask(){
    public void run(){
      LocalDateTime now = LocalDateTime.now();
      String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
      System.out.println(time);
    }
  };

  //calls the task to run every second
  public void clock(){
    clockTimer.scheduleAtFixedRate(task, 1000, 1000);
  }

}