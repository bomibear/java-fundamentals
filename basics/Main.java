public class Main {
  public static void main(String[] args) {
    System.out.println("Calling Pluralize");

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

    System.out.println("Calling Flip N Heads");
    flipNHeads(2);
  }

  public static String pluralize(String word, int num){
    return num > 1 || num == 0 ? word + "s" : word;
  }

  public static void flipNHeads(int n){
    int numberOfHeads = 1;
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
}