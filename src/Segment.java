import java.util.Locale;

public class Segment {
    private Point first, second;
    private String svg;
    private Point points[];

    public Segment(Point x, Point y){
        this.first = x;
        this.second = y;
        points = new Point[2];

        points[0] = x;
    }

    public void setFirst(Point x){
        this.first = x;
    }

    public void setSecond(Point y){
        this.second = y;
    }

    public Point getFirst(){
        return first;
    }

    public Point getSecond(){
        return second;
    }

    public double getDistance(){
        return Math.hypot(first.x - second.x, first.y - second.y);
    }

    public void setSvg(){
        this.svg = "<line x1=\"" + first.x +"\" y1=\"" + first.y + "\" x2=\"" + second.x + "\" y2=\"" + second.y + "\" style=\"stroke:rgb(255,0,0);stroke-width:2\" />";
    }

    public String toSvg(){
        return String.format(Locale.ENGLISH, this.svg);
    }
}
