package assignment7;
public class Trapezoid extends Quadrilateral {

  // Define a private variable called height
  private double height;

  // Define a constructor method for Trapezoid objects, which takes in eight integers representing the (x, y) coordinates of the four corners of the trapezoid
  public Trapezoid(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
    
    // Call the constructor of the parent Quadrilateral class using the 'super' keyword and pass in the four corner points
    super(x1, y1, x2, y2, x3, y3, x4, y4);
    
    // Calculate the height of the trapezoid using the calculateHeight() method
    calculateHeight();
  }

  // Define a private method called calculateHeight() which calculates the height of the trapezoid based on its corner points
  private void calculateHeight() {
    
    // Get an array of the four corner points of the trapezoid using the getPoints() method inherited from the Quadrilateral class
    Point[] points = getPoints();
    
    // Calculate the length of the two parallel bases of the trapezoid using the distance formula
    double base1 = Math.sqrt(Math.pow(points[1].getX() - points[0].getX(), 2) +
            Math.pow(points[1].getY() - points[0].getY(), 2));
    double base2 = Math.sqrt(Math.pow(points[2].getX() - points[3].getX(), 2) +
            Math.pow(points[2].getY() - points[3].getY(), 2));
    
    // Calculate the area of the trapezoid using the formula (1/2) * (base1 + base2) * height
    double area = ((base1 + base2) / 2) * height;
    
    // Calculate the height of the trapezoid using the formula area = (base1 + base2) / 2 * height
    this.height = area / base1;
  }

  // Define a public method called getHeight() which returns the height of the trapezoid as a string
  public String getHeight() {
    return null;
  }

  // Define a public method called getSumOfTwoAdjacentSides() which returns the sum of the lengths of any two adjacent sides of the trapezoid as a string
  public String getSumOfTwoAdjacentSides() {
    return null;
  }
}


