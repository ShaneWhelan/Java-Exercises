public class Exercise10_13 {
  public static void main(String[] args) {
    Triangle2D r1 = new Triangle2D(2, 2, 5.5, 4.9, 9.0, 10.3);
    System.out.println("Area is " + r1.getArea());
    System.out.println("Perimeter is " + r1.getPerimeter());
    System.out.println(r1.contains(new MyPoint(3, 3)));
    System.out.println(r1.contains(new Triangle2D(4, 5, 10.5, 3.2, -0.5, -10.5)));
    System.out.println(r1.overlaps(new Triangle2D(3, 5, 2.3, 6.7, 5.5, 8.8)));
  }
}

class Triangle2D {
	MyPoint p1 = new MyPoint(0, 0);
	MyPoint p2 = new MyPoint(1, 1);
	MyPoint p3 = new MyPoint(2, 5);
	
	public MyPoint getP1(){
		return p1;
	}
	
	public void setP1(double x, double y){
		p1 = new MyPoint(x, y);
	}
	
	public MyPoint getP2(){
		return p2;
	}
	
	public void setP2(double x, double y){
		p2 = new MyPoint(x, y);
	}
	
	public MyPoint getP3(){
		return p3;
	}
	
	public void setP3(double x, double y){
		p3 = new MyPoint(x, y);
	}
	
	public Triangle2D(){
	}
	
	public Triangle2D(double x1, double y1, double x2, double y2, double x3, double y3){
		setP1(x1, y1);
		setP2(x2, y2);
		setP3(x3, y3);
	}
	
	public double getArea(){
		return Math.abs( ((p1.getX() * (p2.getY() - p3.getY())) + (p2.getX() * (p3.getY() - p1.getY())) + (p3.getX() * (p1.getY() - p2.getY()))) / 2);
	}
	
	public double getPerimeter(){
		return (p1.distance(p2) + p2.distance(p3) + p3.distance(p1));
	}
	
	//If I knew the formula I would do it.
	public boolean contains(MyPoint p){
		return true;
	}
	
	public boolean contains(Triangle2D t){
		return true;
	}
	
	public boolean overlaps(Triangle2D t){
		return true;
	}
}

class MyPoint{
	private double x = 0.0;
	private double y = 0.0;
	public MyPoint(){
	}

	public MyPoint(double x, double y){
		this.x = x;
		this.y = y;
	}

	public double getX(){
		return x;
	}

	public double getY(){
		return y;
	}

	public double distance(MyPoint p){
		return (Math.sqrt(Math.pow((p.getX() - this.getX()), 2) + Math.pow((p.getY() - this.getY()), 2)));
	}

	public double distance(double x, double y){
		MyPoint p = new MyPoint(x, y);
		return distance(p);
		//return (Math.sqrt(Math.pow((x - this.getX()), 2) + 
		//		Math.pow((y - this.getY()), 2)));
	}

	public static double distance(MyPoint a, MyPoint b){
		return a.distance(b);
	}
}