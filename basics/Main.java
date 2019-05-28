public class Main {
  public static void main(String[] args) {
    
    //Pluralize
    int petcount = 1;
    String pet = "dog";
    System.out.println("I own " + petcount + " " + pluralize(pet, petcount) + ".");

    //Flipping Coins
    
  }

  public static String pluralize(String word, int a) {
    if (a == 0 || a > 1) {
      return (word + "s");
    } else {
    return word;
    }
  }

}
