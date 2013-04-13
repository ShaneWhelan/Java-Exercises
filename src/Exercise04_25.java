public class Exercise04_25 {
	public static double FindPi(double loop){
		double i = 1.0;
		double ans = 0.0;
		double sum = 0.0;
		while(i < loop){
			sum = sum + (((1.0/((2.0 * i) - 1.0))) - ((1.0/((2.0 * i) + 1.0))));
			ans = 4 * sum;
			i = i + 2.0;
		}
		return ans;
	}
	public static void main(String[] args)
	{
		System.out.println(FindPi(10000.0));
		System.out.println(FindPi(20000.0));
		System.out.println(FindPi(100000.0));
	}
}