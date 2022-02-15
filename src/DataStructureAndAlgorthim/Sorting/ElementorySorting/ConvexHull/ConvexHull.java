package DataStructureAndAlgorthim.Sorting.ElementorySorting.ConvexHull;
import java.util.Arrays;
import java.util.Stack;

public class ConvexHull {
    Stack<Point2D> hull = new Stack<>();

    public ConvexHull(Point2D[] points){
        Arrays.sort(points, Point2D.Y_ORDER);
        Arrays.sort(points, points[0].POLAR_ORDER);

        hull.push(points[0]);
        hull.push(points[1]);

        for(int i=2;i<points.length;i++){
            Point2D p=hull.pop();
            while(Point2D.ccw(hull.peek(),p,points[i])!=1){
                p=hull.pop();
            }
            hull.push(p);
            hull.push(points[i]);
        }
    }

    public Stack<Point2D> getHull() {
        return hull;
    }
}
