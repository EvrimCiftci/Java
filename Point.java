package assignment7;
public class Point {
  private int x; // The x-coordinate of the point.
  private int y; // The y-coordinate of the point.
  
  // Constructor for creating a new Point object.
  public Point(int x, int y) {
  this.x = x;
  this.y = y;
  }
  
  // Getter for the x-coordinate of the point.
  public int getX() {
  return x;
  }
  
  // Setter for the x-coordinate of the point.
  public void setX(int x) {
  this.x = x;
  }
  
  // Getter for the y-coordinate of the point.
  public int getY() {
  return y;
  }
  
  // Setter for the y-coordinate of the point.
  public void setY(int y) {
  this.y = y;
  }
  
  // Returns a string representation of the point in the format (x,y).
  public String toString() {
  return "(" + x + "," + y + ")";
  }
  }