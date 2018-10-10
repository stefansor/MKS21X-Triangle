public class TriangleDriver{
  public static void main (String[] args){
    Point a0 = new Point(0.0,0.0);
    Point a1 = new Point(0.0,1.0);
    Point a2 = new Point(1.0,0.0);
    Point d = new Point(5.0,5.0);
    Triangle A = new Triangle(a0, a1, a2);
    System.out.println(A.getPerimeter());
    System.out.println(A.getVertex(0));
    System.out.println(A.toString());
    A.setVertex(0, d);
    System.out.println(A.toString());
    System.out.println(A.getPerimeter());
    System.out.println(A.getVertex(0));
  }
}
