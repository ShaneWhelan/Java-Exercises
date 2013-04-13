public class Exercise05_11 {
	public static double computeCommission(double salesAmount){
		double commission = 0;
		if(salesAmount <= 5000.00 && salesAmount >= 0.01){
			commission = (salesAmount / 100 * 8);
		}else if(salesAmount <= 10000.00 && salesAmount >= 5000.01){
			commission = ((5000.00 / 100.00) * 8.00) + ((salesAmount - 5000.00) / 100.00 * 10.00);
		}else{
			commission = ((5000.00 / 100.00) * 8.00) + ((10000.00 - 5000.00) / 100.00 * 10.00) + ((salesAmount - 10000.00) / 100 * 12);
		}
		return commission;
	}
	
	public static void main(String[]args){
		System.out.println("Sales Amount" + "\tCommission");
		for(int i = 10000; i <=100000; i = i + 5000){
		System.out.println(i + "\t\t" + computeCommission(i));
		}
	}				
}