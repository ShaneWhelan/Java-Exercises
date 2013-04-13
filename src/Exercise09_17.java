import java.io.File;
import java.util.Scanner;

public class Exercise09_17 {
	public static void main(String[] args) throws Exception{
		File fileName = new File(args[0]);
		
		if(!fileName.exists()){
			System.out.println("File does not exist");
			System.exit(0);
		}
		
		Scanner input = new Scanner(fileName);
		Exercise09_17 word = new Exercise09_17();
		int lineCounter = 0;
		int charCounter = 0;
		String line = "";
		int wordCounter = 0;
		while(input.hasNext() == true){
			line = input.nextLine();
			lineCounter++;
			charCounter += line.length();
			wordCounter = wordCounter + word.wordCount(line);
		}

		System.out.println("File has " + wordCounter + " words.");
		System.out.println("File has " + lineCounter + " lines.");
		System.out.println("File has " + charCounter + " charachters.");		
	}
	public int wordCount(String line){
		int wordCounter = 0;
		String[] array = line.split(" ");
		for(int i = 0; i < array.length; i++){
			wordCounter++;
		}
		return wordCounter;
	}
}