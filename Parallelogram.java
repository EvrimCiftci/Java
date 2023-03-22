package assignment7;

// Parallelogram is a subclass of Quadrilateral
public class Parallelogram extends Quadrilateral {
  
  // Constructor that takes in the four x-y coordinates of the Parallelogram
  public Parallelogram(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
      // Call the constructor of the superclass, Quadrilateral, passing in the coordinates
      super(x1, y1, x2, y2, x3, y3, x4, y4);
  }

  // Method to calculate and return the area of the Parallelogram
  public double getArea() {
      // Get the four points of the Parallelogram
      Point[] points = getPoints();
      
      // Calculate the base of the Parallelogram using the distance formula
      double base = Math.sqrt(Math.pow(points[1].getX() - points[0].getX(), 2) +
              Math.pow(points[1].getY() - points[0].getY(), 2));
      
      // Calculate the height of the Parallelogram by taking the absolute value of the difference
      // between the y-coordinates of the first and fourth points
      double height = Math.abs(points[0].getY() - points[3].getY());
      
      // Calculate and return the area of the Parallelogram using the formula: base * height
      return base * height;
  }
}


