public class PointDriver{
  public static void main(String[]args){
    Point s = new Point(0.0,0.0);
    Point d = new Point(0.0, 14.0);
    System.out.println( Point.distance(s,d) );
    System.out.println(s.toString());
  }
}
