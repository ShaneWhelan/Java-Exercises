import java.util.Scanner;
public class Exercise06_09 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double[] values = new double[10];
		System.out.print("Enter ten numbers: ");

		for(int i = 0; i < values.length; i++){
			values[i] = input.nextDouble();
		}
		System.out.print("The minimum number is: " + minimum(values));
	}
	public static double minimum(double[] array){
		double min = 10000000.0;
		for(int i = 0; i < array.length; i++){
			if(array[i] < min){
				min = array[i];
			}	
		}
		return min;
	}
}