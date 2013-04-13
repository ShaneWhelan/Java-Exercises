import java.util.Scanner;
public class Exercise07_01 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a 4-by-4 matrix row by row: ");	
		
		double[][] grid = new double[4][4];
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				grid[i][j] = input.nextDouble();
			}
		}
		System.out.print("Sum of the matrix is: " + sumMatrix(grid));
	}
	
	public static double sumMatrix(double[][] m){
		double sum = 0.0; 
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				sum += m[i][j];
			}
		}		
		return sum;
	}
}