package oopspractical;

import java.util.Scanner;

public class id1 {
  static class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter value for a: ");
      int a = input.nextInt();

      System.out.print("Enter value for b: ");
      int b = input.nextInt();

      int result1, result2;

      System.out.println("Value of a: " + a);
      result1 = ++a;
      System.out.println("After increment: " + result1);

      System.out.println("Value of b: " + b);
      result2 = --b;
      System.out.println("After decrement: " + result2);

      input.close();
    }
  }
}