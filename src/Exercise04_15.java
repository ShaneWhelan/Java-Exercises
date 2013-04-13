import java.util.Scanner;
public class Exercise04_15 {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();
		
		int d = n1;
		if(d >= n2)
		{
			d = n2;
		}
		int gcd = 1;
		while(d >= 1){
			if(n1 % d == 0 && n2 % d ==0){
				gcd = d;
				d = 1;
			}
			d--;
		}
		System.out.print("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);		
	}
}
