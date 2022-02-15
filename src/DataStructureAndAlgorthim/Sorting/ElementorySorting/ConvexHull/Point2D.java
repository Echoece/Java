package DataStructureAndAlgorthim.Sorting.ElementorySorting.ConvexHull;

import java.util.Comparator;

public class Point2D {

    public final Comparator<Point2D> POLAR_ORDER= new Polarorder();
    private final double x;
    private final double y;

    public Point2D(double x,double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }


    // check counter clock wise or not between 3 points
    public static int ccw(Point2D a, Point2D b, Point2D c){
        double area2=(b.x-a.x)*(c.y-a.y)-(b.y-a.y)*(c.x-a.x);
        if(area2>0) {return 1;}  //counter-clock-wise
        if(area2<0) {return -1;}
        return 0;
    }

    static final Comparator<Point2D> Y_ORDER= new Comparator<>() {
        @Override
        public int compare(Point2D p1, Point2D p2) {
            return Double.compare(p1.y, p2.y);
        }

    };

    // for sorting by polar order
    public class Polarorder implements Comparator<Point2D> {
        @Override
        public int compare(Point2D o1, Point2D o2) {
            double dy1=o1.y-y;
            double dy2=o2.y-y;

            if(dy1==0 && dy2==0){
                return 0;
            } else if(dy1>=0 && dy2<0){
                return -1;
            }else if(dy2>=0 && dy1<0){
                return 1;
            }else{
                return -ccw(Point2D.this,o1,o2);
            }
        }
    }

}
