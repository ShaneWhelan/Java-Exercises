
public class Exercise10_04{
	public static void main(String[] args){
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(10.0, 30.5);
		System.out.println(p1.distance(p2));
		System.out.println(MyPoint.distance(p1, p2));
	}	
}

/*class MyPoint{
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
} */