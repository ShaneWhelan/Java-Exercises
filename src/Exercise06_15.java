import java.util.Scanner;
public class Exercise06_15 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int[] values = new int[10];
		
		System.out.print("Enter ten numbers: ");
		for(int i = 0; i < values.length; i++){
			values[i] = input.nextInt();
		}
		
		values = eliminateDuplicates(values);
		
		System.out.print("The distinct numbers are: ");
		for(int j = 0; j < values.length; j++){
			if(values[j] > 0){
				System.out.print(values[j] + " ");
			}
		}
	}
	
	public static int[] eliminateDuplicates(int[] numbers){
		int temp = 0;
		for(int i = 0; i < numbers.length; i++){
			temp = i;
			for(int j = temp + 1; j < numbers.length; j++){
				if(numbers[temp] == numbers[j]){
					numbers[i] = 0;
				}
			}
		}
		
		return numbers;
	}
}