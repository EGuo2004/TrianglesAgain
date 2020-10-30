public class Triangle{
  private Point v1;
  private Point v2;
  private Point v3;

  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }
  public Triangle(double x1, double y1,double x2, double y2,double x3, double y3) {
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }

  public double getPerimeter() {
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v1.distanceTo(v3);
  }

  public double getArea() {
    double a = v1.distanceTo(v2);
    double b = v2.distanceTo(v3);
    double c = v1.distanceTo(v3);
    double s = (a + b + c) / 2;
    double a1 = s - a;
    double b1 = s - b;
    double c1 = s - c;
    return Math.sqrt(s * a1 * b1 * c1);
  }

  public String classify() {
    double a = v1.distanceTo(v2);
    double b = v2.distanceTo(v3);
    double c = v1.distanceTo(v3);
    if ( a == b || b == c || a == c) {
      return "isoceles";
    }
    if ( a == b && a == c) {
      return "equilateral";
    }
      return "scalene";
  }

  public String toString() {
    return ("v1("+v1.getX() + "," + v1.getY()+")"+"v2("+v2.getX() + "," + v2.getY()+")"+"v3("+v3.getX() + "," + v3.getY()+")");
  }

  public void setVertex(int index, Point newP) {
    if (index == 0) {
      v1 = new Point (newP);
    } else {
      if (index == 1) {
        v2 = new Point (newP);
      }  else {
        if(index == 2) {
          v3 = new Point (newP);
        } else {
        }
      }
    }
  }
}
