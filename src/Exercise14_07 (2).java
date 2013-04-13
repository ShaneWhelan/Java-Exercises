import java.util.Date;


public class Exercise14_07 {
  public static void main(String[] args) throws CloneNotSupportedException {
    Octagon a1 = new Octagon(5.0);
    System.out.println("Area is " + a1.getArea());
    System.out.println("Perimeter is " + a1.getPerimeter());

    Object a2 = a1.clone();
    System.out.println(a1.getColor() + "\n" + ((Octagon)a2).getColor());
    a1.setColor("black");
    System.out.println(a1.getColor() +"\n" + ((Octagon)a2).getColor());
    ((Octagon)a2).setColor("red");
    System.out.println(a1.getColor() + "\n" + ((Octagon)a2).getColor());
    System.out.println("Compare the methods " + a1.compareTo(a2));
    a1.d = new Date();
    System.out.println(a1.d.toString());
    System.out.println(((Octagon)a2).d.toString());
    
  }
}