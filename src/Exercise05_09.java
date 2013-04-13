public class Exercise05_09 {

	public static double feetToMeters(double feet){
		double meters = 0.305 * feet;
		return meters;
	}
	
	public static double metersToFeet(double meter){
		double feetCon = meter / 0.305;
		return feetCon;
	}
	public static void main(String[] args){

		System.out.println("Feet\tMeters\tMeters\tFeet");
		double z = 20.0;
		for(double i = 1.0; i <= 10.0; i++){
			System.out.println(i + "\t" + feetToMeters(i) + "\t" + (z) + "\t" + metersToFeet(z));
			z = z + 5;
		}
	}
}
