import java.util.Scanner;

//Comand Prompt Class is first followed by Dialog Box Prompt
public class Exercise02_11 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		
		System.out.print("Number of hours worked in a week: ");
		int hours = input.nextInt();
		
		System.out.print("Hourly pay rate: ");
		double payRate = input.nextDouble();
		
		System.out.print("Federal tax withholding rate: ");
		int federalTax = input.nextInt();
		
		System.out.print("State tax withholding rate: ");
		int stateTax = input.nextInt();
		
		double gross = hours * payRate;
		double dedFederal = gross / 100 * federalTax;
		double dedState = gross / 100 * stateTax;
		double totalDed = dedFederal + dedState;
		double netPay = gross - totalDed;
		
		System.out.println("Employee name: " + name);
		System.out.println("Hours worked: " + hours);
		System.out.println("Pay rate: " + payRate);
		System.out.println("Gross pay: " + gross);
		System.out.println("Deductions:");
		System.out.println("Federal withholding (" + federalTax + "%) : " + dedFederal);
		System.out.println("State withholding (" + stateTax + "%) : " + dedState);
		System.out.println("Total deductions: " + totalDed);
		System.out.println("Net pay: " + netPay);
	}
}