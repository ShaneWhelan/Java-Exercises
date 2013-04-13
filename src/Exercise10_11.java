
public class Exercise10_11 {
	public static void main(String[] args){
	    Circle2D c1 = new Circle2D(2, 2, 5.5);
	    System.out.println("Area is " + c1.getArea());
	    System.out.println("Perimeter is " + c1.getPerimeter());
	    System.out.println(c1.contains(3, 3));
	    System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
	    System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
	}
}

class Circle2D{
	private double x = 0;
	private double y = 0;
	private double radius = 1;
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public Circle2D(){
	}
	
	public Circle2D(double x, double y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getArea(){
		return (Math.PI * (getRadius() * getRadius()));
	}
	
	public double getPerimeter(){
		return (2 * Math.PI * getRadius());
	}
	
	public boolean contains(double x, double y){
		if((Math.sqrt(Math.pow((x - this.getX()), 2) + Math.pow((y - this.getY()), 2))) <= this.getRadius()){
			return true;
		}
		return false;
	}
	
	public boolean contains(Circle2D circle){
		if((Math.sqrt(Math.pow((circle.getX() - this.getX()), 2) + Math.pow((circle.getY() - this.getY()), 2))) <= this.getRadius()){
			return true;
		}
		return false;
	}
	
	public boolean overlaps(Circle2D circle){
		if((Math.sqrt(Math.pow((circle.getX() - this.getX()), 2) + Math.pow((circle.getY() - this.getY()), 2))) < (circle.getRadius() + this.getRadius())){
			return true;
		}
		return false;
	}
}