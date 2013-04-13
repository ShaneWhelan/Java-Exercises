
public class Octagon extends GeometricObject implements Comparable<Object>, Cloneable {
	private double side;
	
	Octagon(double side){
		this.side = side;
	}
	
	public double getSide(){
		return side;
	}
	
	public double getArea(){
		return ((2 + (4/Math.sqrt(2))) * side * side);
	}
	
	public double getPerimeter(){
		return side * 8;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return new Octagon(this.side);
	}
	
	public int compareTo(Object o){
		if(this.getArea() > ((Octagon)o).getArea()){
			return 1;
		}else if(this.getArea() < ((Octagon)o).getArea()){
			return -1;
		}else{
			return 0;
		}
	}

}
