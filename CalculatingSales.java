
import java.util.Scanner;

public class CalculatingSales {
public static void main(String[] args) {
  Scanner myObj3 = new Scanner(System.in);

  while (true) {
    System.out.println("if you want to start to shopping press 1 if you want to shut down the program press 0");
    int run = myObj3.nextInt(); // Read user input

    if (run == 1) {
      System.out.println("Menu");
      System.out.println("product 1 : $2.98");
      System.out.println("product 2 : $4.50");
      System.out.println("product 3 : $9.98");
      System.out.println("product 4 : $4.49");
      System.out.println("product 5 : $6.87");
      Scanner myObj = new Scanner(System.in);
      System.out.println("Enter item number");
      int item = myObj.nextInt(); // Read user input
      if (item > 5) {
        System.out.println("Invalid input for item number.");
        System.exit(0);
      } else if (item < 1) {
        System.out.println("Invalid input for item number.");
        System.exit(0);
      }
      System.out.println("Enter quantity number");
      int quantity = myObj.nextInt(); // Read user input
      if (quantity < 1) {
        System.out.println("Invalid input for quantity number.");
        System.exit(0);
      }
      double total = 0;
      if (item == 1) {
        total = +2.98 * quantity;
        System.out.println(quantity + "quantity");
        System.out.println(total);
      } else if (item == 2) {
        total = +4.50 * quantity;
        System.out.println(quantity + "quantity");
        System.out.println(total);
      } else if (item == 3) {
        total = +9.98 * quantity;
        System.out.println(quantity + "quantity");
        System.out.println(total);
      } else if (item == 4) {
        total = +4.49 * quantity;
        System.out.println(quantity + "quantity");
        System.out.println(total);
      } else if (item == 5) {
        total = +6.87 * quantity;
        System.out.println(quantity + "quantity");
        System.out.println(total);
      }
      myObj.close();
    }

    if (run == 0) {
      System.out.println("Thank for using our program, it's shutting down");
      break;
    }
  }
  myObj3.close();
}
}


