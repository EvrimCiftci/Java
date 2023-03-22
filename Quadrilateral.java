package assignment7;
import java.util.Arrays;

public class Quadrilateral {
    private Point[] points = new Point[4];

    public Quadrilateral(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        points[0] = new Point(x1, y1);
        points[1] = new Point(x2, y2);
        points[2] = new Point(x3, y3);
        points[3] = new Point(x4, y4);
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public String toString() {
        return "Quadrilateral with points: " + Arrays.toString(points);
    }

    public String getCoordinatesAsString() {
        StringBuilder sb = new StringBuilder();
        for (Point p : points) {
            sb.append("(").append(p.getX()).append(",").append(p.getY()).append(")");
        }
        return sb.toString();
    }
}
