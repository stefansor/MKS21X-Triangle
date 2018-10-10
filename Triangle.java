public class Triangle {
  private Point pt0, pt1, pt2;

  public Triangle(Point a, Point b, Point c){
    pt0 = a;
    pt1 = b;
    pt2 = c;
  }
  public Triangle(double a1, double a2, double b1, double b2, double c1, double c2){
    pt0 = new Point(a1, a2);
    pt1 = new Point(b1, b2);
    pt2 = new Point(c1, c2);
  }
  public double getPerimeter(){
    double perim = Point.distance(pt0, pt1) + Point.distance(pt1, pt2) +
    Point.distance(pt2, pt0);
    return perim;
  }
  public Point getVertex(int index){
    if(index == 0){
      return new Point(pt0.getX(), pt0.getY());
    }
    if(index == 1){
      return new Point(pt1.getX(), pt1.getY());
    }
    return new Point(pt2.getX(), pt2.getY());
  }
  public String toString(){
    return "Triangle: A" + pt0.toString() + " B" + pt1.toString() + " C" +
    pt2.toString();
  }
  public void setVertex(int index, Point newP){
    if(index == 0){
      pt0 = newP;
    }
    if(index == 1){
      pt1 = newP;
    }
    if(index == 2){
      pt2 = newP;
    }
  }

}
