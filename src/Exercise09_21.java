import java.io.File;
import java.util.Scanner;

public class Exercise09_21 {
	public static void main(String[] args) throws Exception{
		File fileName = new File(args[0]);
		
		if(!fileName.exists()){
			System.out.println("File does not exist");
			System.exit(0);
		}
		Scanner word = new Scanner(System.in);
		Scanner input = new Scanner(fileName);
		System.out.print("Enter word: ");
		
		String del = word.next();
		String line = "";
		String deleted ="";
		
		while(input.hasNext() == true){
			deleted = line.replaceAll(del, "");
			line = input.nextLine();
			System.out.println(deleted);
		}
		
		
	}
}
