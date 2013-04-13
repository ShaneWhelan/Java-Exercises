import java.util.Scanner;
public class Exercise04_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an int Value, the program exits if the input is 0:");
		
		int numbers = input.nextInt();
		int countNeg = 0, countPos = 0;
		float averageNums = 0;
		
		while(numbers != 0){
			if(numbers > 0)
			{
				countPos++;
			}else if(numbers < 0){
				countNeg++;	
			}
			averageNums = averageNums + numbers;
			numbers = input.nextInt();
		}

		int total = countPos + countNeg;
		float average = averageNums / (float) (total);
		System.out.println("The number of Positives is " + countPos);
		System.out.println("The number of Negatives is " + countNeg);
		System.out.println("The total is " + total);
		System.out.println("The average is " + average);
	}
}