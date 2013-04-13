import java.util.Scanner;
public class Exercise07_13 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();
		double[][] grid = new double[rows][columns];
		
		System.out.print("Enter the array: ");
		
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				grid[i][j] = input.nextDouble();
			}
		}
		int[] co1 = new int[3];
		co1 = locateLargest(grid);
		System.out.print("The location of the largest element is: ");
		System.out.print("(" + co1[1]+ ", " + co1[2] + ")");
	}
	public static int[] locateLargest(double[][] a){
		double max = 0.0; 
		int[] co = new int[3];
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				if(max < a[i][j]){
					max = a[i][j];
					co[1] = i;
					co[2] = j;
				}
			}
		}
		return co;
	}
}