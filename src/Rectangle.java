import java.awt.*;
import java.awt.geom.Point2D;

public class Rectangle extends Shape {
    public Rectangle(int x, int y, int width, int height) {
        super(new Point2D.Double(x, y), new Point2D.Double(x + width, y),
                new Point2D.Double(x + width, y + height), new Point2D.Double(x, y + height));
    }

    public Rectangle(Point2D point1, Point2D point2) {
        super(point1, (new Point2D.Double(point2.getX(), point1.getY())), point2, (new Point2D.Double(point1.getX(), point2.getY())));

    }
}
