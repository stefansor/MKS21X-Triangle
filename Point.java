public class Point{
  private double x,y;

  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public Point(Point p){
    x= p.x;
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }
  public static double distance(Point d, Point s){
    return Math.sqrt(((s.getX() - d.getX()) * (s.getX() - d.getX())) +
     (s.getY() - d.getY()) * (s.getY() - d.getY()));
  }
  public double distanceTo(Point other){
    return Math.sqrt((this.getX() - other.getX()) * (this.getX() - other.getX()) +
    (this.getY() - other.getY()) * (this.getY() - other.getY()));
  }
  public String toString(){
    return "(" + this.getX() + "," + this.getY() + ")";
  }
}
