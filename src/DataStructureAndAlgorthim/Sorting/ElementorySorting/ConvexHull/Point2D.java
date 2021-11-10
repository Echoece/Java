package DataStructureAndAlgorthim.Sorting.ElementorySorting.ConvexHull;

public class Point2D {
    private final double x;
    private final double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static int counterClockWise(Point2D a, Point2D b, Point2D c){
        double area2D= (b.x - a.x)*(c.y - a.y) - (b.y - a.y)*(c.y - a.x);
        if(area2D < 0)
            return -1; // clockwise
        else if(area2D >0 )
            return 1;  // counter-clockwise
        else
            return 0; // collinear
    }
}
