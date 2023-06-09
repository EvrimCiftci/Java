import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers between 1 and 30:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scan.nextInt();
        }

        System.out.println("Bar Chart:");
        for (int number : numbers) {
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}