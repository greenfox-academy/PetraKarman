import java.util.Scanner;

public class BunniesAgain {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of bunnies:");
    int userInput = scanner.nextInt();

    System.out.println(("The number of ears: ") + (bunnies(userInput)));
  }

  private static int bunnies(int n) {
    if (n == 1) {
      return 2;
    } else if (n % 2 == 1){
      return  2 + bunnies(n-1);
    } else
      return  3 + bunnies(n-1);
  }
}

// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication)
