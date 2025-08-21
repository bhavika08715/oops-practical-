package ooppractical;

import java.util.Scanner;

public class assignment {
  static class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Take input from user
      System.out.print("Enter value for a: ");
      int a = input.nextInt();

      int var;

      // Using assignment operators
      var = a;
      System.out.println("var using =: " + var);

      var += a;
      System.out.println("var using +=: " + var);

      var *= a;
      System.out.println("var using *=: " + var);

      input.close();
    }
  }
}