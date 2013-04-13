import java.util.Scanner;
public class Exercise08_13{
	public int row, column;
	public double maxValue;
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns of the array: ");
	
		int numberOfRows = input.nextInt();
		int numberOfColumns = input.nextInt();
	
		double[][] a = new double[numberOfRows][numberOfColumns];
	
		System.out.println("Enter the array: ");
	
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++)
				a[i][j] = input.nextDouble();
	
		Exercise08_13 loc = new Exercise08_13();
		loc.locateLargest(a);
		System.out.println("The location of the largest element is " + loc.maxValue + " at (" + loc.row + ", " + loc.column + ")");
	}
	
	public void locateLargest(double[][] a) {
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++){
				if(maxValue  < (a[i][j])){
					maxValue = (a[i][j]);
					row = i;
					column = j;
				}
			}
		}
	}
}