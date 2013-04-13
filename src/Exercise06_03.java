import java.util.Scanner;
public class Exercise06_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Integers between 1 and 100, the program exits if the input is 0:");
		
		int numbers = input.nextInt();
		int[] values = new int[101];
		
		for(int i = 0; i < values.length; i++){
			values[i] = 0;
		}
		
		while(numbers != 0 && numbers < 101){
			values[numbers] = values[numbers] + 1;
			numbers = input.nextInt();			
		}
		
		for(int i = 0; i < values.length; i++){
			if(values[i] > 0 && values[i] < 2){
				System.out.println(i + " occurs " + values[i] + " time");
			}else if(values[i] > 1){
				System.out.println(i + " occurs " + values[i] + " times");			
			}
		}
	}
}