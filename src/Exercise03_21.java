import java.util.Scanner;
public class Exercise03_21
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter year: (e.g., 2008): ");
		int year = input.nextInt();
		
		System.out.print("Enter month: 1-12: ");
		int month = input.nextInt();
		
		System.out.print("Enter the day of the month 1-31: ");
		int day = input.nextInt();
		
		int currentYear = year;
		
		if(month == 1)
		{
			month = 13;
			currentYear = currentYear - 1;
		}else if(month == 2){
			month = 14;
			currentYear = currentYear - 1;
		}else{}
			
		int yearOfCent = year%100;
		int cent = year / 100;
		
		int dayOfWeek = ((day + ((26*(month + 1))/10) + yearOfCent + (yearOfCent/4) + (cent/4) + (5 * cent) ) % 7) ;
		
		String dayWord;
		if(dayOfWeek == 0)
		{
			dayWord = "Saturday";
		}else if(dayOfWeek == 1)
		{
			dayWord = "Sunday";
		}else if(dayOfWeek == 2)
		{
			dayWord = "Monday";
		}else if(dayOfWeek == 3)
		{
			dayWord = "Tuesday";
		}else if(dayOfWeek == 4)
		{
			dayWord = "Wednesday";
		}else if(dayOfWeek == 5)
		{
			dayWord = "Thursday";
		}else{
			dayWord = "Friday";
		}
		
		System.out.println("Day of the week is " + dayWord);
	}
}