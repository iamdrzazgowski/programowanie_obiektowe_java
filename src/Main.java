import java.util.Locale;

public class Main {

    public static final Point test = new Point(2,3);

    public static void main(String[] args) {
        Point p1 = new Point(5,6);
        Point p2 = new Point(10,3);
        Segment segment = new Segment(p1, p2);

        //return String.format(Locale.ENGLISH, "<linse x1=\"\"....>", p1.x, p1.y);


        System.out.println(segment.getDistance());
    }
}