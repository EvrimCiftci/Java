package assignment7;

public class Main {
  public static void main(String[] args) {
    // Create a Quadrilateral object with the given coordinates
    Quadrilateral quad = new Quadrilateral(0, 0, 1, 1, 2, 0, 1, -1);
    // Create a Parallelogram object with the given coordinates
    Parallelogram para = new Parallelogram(0, 0, 2, 0, 3, 2, 1, 2);
    // Create a Trapezoid object with the given coordinates
    Trapezoid trap = new Trapezoid(0, 0, 2, 0, 3, 2, 1, 2);

    // Print the Quadrilateral object's string representation
    System.out.println("Quadrilateral:");
    System.out.println(quad.toString());
    // Print the Quadrilateral object's coordinates as a string
    System.out.println("Coordinates: " + quad.getCoordinatesAsString());

    // Print the Parallelogram object's string representation
    System.out.println("\nParallelogram:");
    System.out.println(para.toString());
    // Print the Parallelogram object's coordinates as a string
    System.out.println("Coordinates: " + para.getCoordinatesAsString());
    // Print the Parallelogram object's area
    System.out.println("Area: " + para.getArea());

    // Print the Trapezoid object's string representation
    System.out.println("\nTrapezoid:");
    System.out.println(trap.toString());
    // Print the Trapezoid object's coordinates as a string
    System.out.println("Coordinates: " + trap.getCoordinatesAsString());
    // Print the Trapezoid object's height
    System.out.println("Height: " + trap.getHeight());
    // Print the Trapezoid object's sum of two adjacent sides
    System.out.println("Sum of two adjacent sides: " + trap.getSumOfTwoAdjacentSides());
  }
}
