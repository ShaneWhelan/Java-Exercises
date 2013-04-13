import java.util.Scanner;
public class Exercise07_19 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of rows:");
		int rows = input.nextInt();
		System.out.print("Enter number of columns:");
		int cols = input.nextInt();
		int[][] nums = new int[rows][cols];
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums[0].length; j++){
				nums[i][j] = (int) (Math.random() * 10);
			}
		}
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums[0].length; j++){
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Result is: " + isConsecutiveFour(nums));
	}
	
	public static boolean isConsecutiveFour(int[][] values){
		for(int i = 0; i < values.length; i++){
			for(int j = 0; j < values[0].length; j++){
				if(i < values.length - 3){
					if(values[i][j] == values[i+1][j] && values[i][j] == values[i+2][j] && values[i][j] == values[i+3][j]){
					return true;
					}
				}
				if(j < values.length - 3){
					if(values[i][j] == values[i][j+1] && values[i][j] == values[i][j+2] && values[i][j] == values[i][j+3]){
						return true;
					}
				}
				if(i < values.length - 3 && j < values[0].length - 3){
					if(values[i][j] == values[i+1][j+1] && values[i][j] == values[i+2][j+2] && values[i][j] == values[i+3][j+3]){
						return true;
					}
				}
				if(i < values.length - 3 && j > 3){
					if(values[i][j] == values[i+1][j-1] && values[i][j] == values[i+2][j-2] && values[i][j] == values[i+3][j-3]){
						return true;
					}
				}
			}
		}

		return false;
	}
}