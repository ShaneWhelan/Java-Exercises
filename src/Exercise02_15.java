public class Exercise02_15 
{
	public static void main(String[] args)
	{
		double savings = 100, monthlyRate = 0.05/12;
		double sixMonths = savings * (1 + monthlyRate);
		sixMonths = (savings + sixMonths) * (1 + monthlyRate);
		sixMonths = (savings + sixMonths) * (1 + monthlyRate);
		sixMonths = (savings + sixMonths) * (1 + monthlyRate);
		sixMonths = (savings + sixMonths) * (1 + monthlyRate);
		sixMonths = (savings + sixMonths) * (1 + monthlyRate);
		System.out.print(sixMonths);
	}
}