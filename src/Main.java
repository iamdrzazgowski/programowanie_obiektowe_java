import java.util.Locale;

public class Main {

    public static final Point test = new Point(2,3);

    public double foo(Segment segment, Point point){
        Point p1 = segment.getFirst();
        Point p2 = segment.getSecond();

        double dx = p2.x - p1.x;
        double dy = p2.y - p1.y;

        Point p3 = new Point(point.x - dy, point.y + dx);
        Point p4 = new Point(point.x + dy, point.y - dx);

        return 0;
    }

    public static void main(String[] args) {
        Point p1 = new Point(5,6);
        Point p2 = new Point(10,3);
        Segment segment = new Segment(p1, p2);

        System.out.println(segment.getDistance());
        segment.setSvg();
        System.out.println(segment.toSvg());
    }
}