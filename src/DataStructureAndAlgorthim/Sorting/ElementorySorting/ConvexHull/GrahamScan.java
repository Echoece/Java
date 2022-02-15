package DataStructureAndAlgorthim.Sorting.ElementorySorting.ConvexHull;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class GrahamScan {
    public static void main(String[] args) {
        /*
        Point2D []points=new Point2D[40];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<40;i++){
            double x= scanner.nextDouble();
            double y= scanner.nextDouble();
            points[i]=new Point2D(x,y);
        }
        */

        Point2D []dummyPoints = {new Point2D(0,3),
                new Point2D(0,21),
                new Point2D(2,22),
                new Point2D(8,2),
                new Point2D(12,9),
                new Point2D(3,17),
                new Point2D(11,14),
                new Point2D(24,6)
        };


        System.out.println("Points on the hull are:");

        //ConvexHull convexHull=new ConvexHull(points);
        ConvexHull convexHull=new ConvexHull(dummyPoints);
        Stack<Point2D> st=convexHull.getHull();
        int n=st.size();
        for(int i=0;i<n;i++){
            Point2D p=st.pop();
            System.out.println(p.getX()+" "+p.getY());
        }
    }
}
