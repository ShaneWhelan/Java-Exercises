import javax.swing.JOptionPane;
public class Exercise02_11B {
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("Enter employee's name:");
	
		String hoursString = JOptionPane.showInputDialog("Number of hours worked in a week:");
		int hours = Integer.parseInt(hoursString);
		
		String payRateString = JOptionPane.showInputDialog("Hourly pay rate:");
		double payRate = Double.parseDouble(payRateString);
		
		String federalTaxString = JOptionPane.showInputDialog("Federal tax withholding rate:");
		int federalTax = Integer.parseInt(federalTaxString);
		
		String stateTaxString = JOptionPane.showInputDialog("State tax withholding rate:");
		int stateTax = Integer.parseInt(stateTaxString);
		
		double gross = hours * payRate;
		double dedFederal = gross / 100 * federalTax;
		double dedState = gross / 100 * stateTax;
		double totalDed = dedFederal + dedState;
		double netPay = gross - totalDed;
		String output = "Employee name: " + name + "\nHours worked: " + hours + "\nPay rate: " + payRate + "\nGross pay: " + gross +"\nDeductions:" + 
		"\n\tFederal withholding (" + federalTax + "%) : " + dedFederal + "\n\tState withholding (" + stateTax + "%) : " + dedState + "Total deductions: " 
		+ totalDed + "\nNet pay: " + netPay;
		JOptionPane.showMessageDialog(null, output);
	}
}