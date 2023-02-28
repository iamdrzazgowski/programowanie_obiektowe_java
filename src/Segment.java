public class Segment {
    private Point first, second;
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

}
