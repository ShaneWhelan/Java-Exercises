import java.util.Scanner;
public class Exercise07_09 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String[][] grid = new String[4][4];
		boolean gameState = true, go = true;
		int moveCount = 0, row = 0, col = 0;
		
		for(int i = 1; i < 4; i++){
			for(int j = 1; j < 4; j++){
			grid[i][j] = "";
			}
		}
		
		while(gameState == true && moveCount < 10){
			for(int i = 1; i < 4; i++){
				for(int j = 1; j < 4; j++){
					System.out.print(grid[i][j] + "\t");
				}
				System.out.println();
			}
			if(go == true){
				go = false;
			}else{
				go = true;
			}
			if(go == false){
				System.out.print("Enter a row (1, 2 or 3) for player X: ");
				row = input.nextInt();
				System.out.print("Enter a col (1, 2 or 3) for player X: ");
				col = input.nextInt();
				grid[row][col] = "X";
			}else{
				System.out.print("Enter a row (1, 2 or 3) for player O: ");
				row = input.nextInt();
				System.out.print("Enter a col (1, 2 or 3) for player O: ");
				col = input.nextInt();
				grid[row][col] = "O";
			}
			
			gameState = hasWon(grid);
			if(gameState == false && go == false ){
				System.out.println("X player has won");
				for(int i = 1; i < 4; i++){
					for(int j = 1; j < 4; j++){
						System.out.print(grid[i][j] + "\t");
					}
					System.out.println();
				}
			}else if(gameState == false && go == true){
				System.out.println("O player has won");
				for(int i = 1; i < 4; i++){
					for(int j = 1; j < 4; j++){
						System.out.print(grid[i][j] + "\t");
					}
					System.out.println();
				}
			}else if(moveCount > 7 && gameState == true){
				System.out.println("It's a draw");
				for(int i = 1; i < 4; i++){
					for(int j = 1; j < 4; j++){
						System.out.print(grid[i][j] + "\t");
					}
					System.out.println();
				}
			}
			moveCount++;
		}
	}
	
	public static boolean hasWon(String[][] grid){
		boolean gameState = true;
		if(grid[1][1] == grid[1][2] && grid[1][2] == grid[1][3] && grid[1][1] != ""){
			gameState = false;
		}else if(grid[2][1] == grid[2][2] && grid[2][2] == grid[2][3] && grid[2][1] != ""){
			gameState = false;
		}else if(grid[3][1] == grid[3][2] && grid[3][2] == grid[3][3] && grid[3][1] != ""){
			gameState = false;
		}else if(grid[1][1] == grid[2][1] && grid[2][1] == grid[3][1] && grid[1][1] != ""){
			gameState = false;
		}else if(grid[1][2] == grid[2][2] && grid[2][2] == grid[3][2] && grid[1][2] != ""){
			gameState = false;
		}else if(grid[1][3] == grid[2][3] && grid[2][3] == grid[3][3] && grid[1][3] != ""){
			gameState = false;
		}else if(grid[1][1] == grid[2][2] && grid[2][2] == grid[3][3] && grid[1][1] != ""){
			gameState = false;
		}else if(grid[3][1] == grid[2][2] && grid[2][2] == grid[1][3] && grid[3][1] != ""){
			gameState = false;
		}else{
			gameState = true;
		}
		return gameState;
	}
}