public class Exercise08_09 {
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	
	public void polyDefault(){
	}
	
	public void polyUser(int nU, double sideU){
		setN(nU);
		setSide(sideU);
		setX(0);
		setY(0);
	}
	
	public void polyUserWithXY(int nU, double sideU, double xU, double yU){
		setN(nU);
		setSide(sideU);
		setX(xU);
		setY(yU);
	}

	public int getN(){
		return n ;
	}
	
	public void setN(int userN){
		n = userN;
	}
	
	public double getSide(){
		return side;
	}
	
	public void setSide(double userSide){
		side = userSide;
	}
	
	public double getX(){
		return x;
	}
	
	public void setX(double userX){
		x = userX;
	}	
	
	public double getY(){
		return y;
	}
	
	public void setY(double userY){
		y = userY;
	}
	
	public double getPerimeter(){
		return (side * n);
	}
	
	public double getArea(){
		return ((n * side * side) / (4 * (Math.tan(Math.PI / n))));
	}
	public static void main(String[] args) {
		Exercise08_09 polygon1 = new Exercise08_09();
		Exercise08_09 polygon2 = new Exercise08_09();
		Exercise08_09 polygon3 = new Exercise08_09();
		polygon2.polyUser(6, 4);
		polygon3.polyUserWithXY(10, 4.0, 5.6, 7.8);
		System.out.println("Polygon 1 perimeter: " + polygon1.getPerimeter());
		System.out.println("Polygon 1 area: " + polygon1.getArea());
		System.out.println("Polygon 2 perimeter: " + polygon2.getPerimeter());
		System.out.println("Polygon 2 area: " + polygon2.getArea());
		System.out.println("Polygon 3 perimeter: " + polygon3.getPerimeter());
		System.out.println("Polygon 3 area: " + polygon3.getArea());
	}
}
