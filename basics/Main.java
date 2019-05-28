public class Main {
  public static void main(String[] args) {
    
    //Pluralize
    int petcount = 1;
    String pet = "dog";
    System.out.println("I own " + petcount + " " + pluralize(pet, petcount) + ".");
    
    //Flipping Coins
    flipNHeads(3);

  }

  public static String pluralize(String word, int a) {
    if (a == 0 || a > 1) {
      return (word + "s");
    } else {
    return word;
    }
  }

  public static void flipNHeads(int n) { 
    int numberOfFlips = 0;
    int numberOfHeads = 0;
    while(n != numberOfHeads){
      numberOfFlips++;
      if(randomNumberGenerator() >= .5){
        numberOfHeads++;
        System.out.println("heads");
      } else {
        numberOfHeads = 0;
        System.out.println("tails");
      }
    }
    System.out.println("It took " + numberOfFlips + " flips to flip " + n + " heads in a row.");
  }

  //Random number
  public static double randomNumberGenerator(){
    return Math.random()* 2;
  }

}
