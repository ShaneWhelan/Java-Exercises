public class Exercise08_01 {
	double width = 1;
	double height = 1;
	
	public void defaultRec(){		
	}
	
	public void userRec(double widthU, double heightU){		
		width = widthU;
		height = heightU;
	}
	
	public double getArea(){
		double area = width * height; 
		return area;
	}
	
	public double getPerimeter(){
		double perimeter = (width * 2) + (height * 2);
		return perimeter;
	}
	
	public static void main(String[]args){
		Exercise08_01 rec1 = new Exercise08_01();
		rec1.userRec(4.0, 40);
		System.out.println("The area of a rectangle with width " + rec1.width + " and height " + rec1.height + " is " +rec1.getArea());
		System.out.println("The perimeter of a rectangle is " + rec1.getPerimeter());
		rec1.userRec(3.5, 35.9);
		System.out.println("The area of a rectangle with width " + rec1.width + " and height " + rec1.height + " is " +rec1.getArea());
		System.out.println("The perimeter of a rectangle is " + rec1.getPerimeter());
	}
}