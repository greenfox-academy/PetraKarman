/**
 * Created by Petra on 2017. 03. 23..
 */

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer:");
    int userInput = scanner.nextInt();
    factorio(userInput);
  }

  private static void factorio(int input) {
    int factorial = 1;
    for (int i = 1; i <= input; i++) {
      factorial = factorial * i;
    }
    System.out.println(factorial);
  }
}

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial