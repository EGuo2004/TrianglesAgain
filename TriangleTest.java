public class TriangleTest{

  public static void main(String[]args){
    // Test Points
    Point P0 = new Point(0,0); //Origin
    Point P1 = new Point(1,1);
    Point P2 = new Point(2,2);
    Point P3 = new Point(2,2);
    Point P4 = new Point(3,4);

    //Point Testing
    System.out.println(P1.distanceTo(P2) );
    System.out.println(P2.equals(P3));
    System.out.println(P1.equals(P3));
    System.out.println(P0.distanceTo(P4));

    //Test TriangleTest
    Triangle t1 = new Triangle(0, 0, 3, 0, 3, 3);
    Triangle t2 = new Triangle(0, 0, 3, 0, 3, 4);

    System.out.println(t2.getPerimeter());
    System.out.println(t2.getArea());
    System.out.println(t1.classify());
    System.out.println(t2.classify());
    System.out.println(t1.toString());
    System.out.println(t2.toString());
    t1.setVertex(2,P4);
    System.out.println(t1.getPerimeter());
    System.out.println(t1.getArea());
  }
 }
