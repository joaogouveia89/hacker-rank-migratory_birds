import java.io.*; 
import java.util.Arrays;

public class RunSolution{

	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RESET = "\u001B[0m";

	public static void main(String[] args) throws Exception{

		//input parsing and reading
		File input00File = new File("../../test-cases/input/input00.txt");
		BufferedReader brInput00 = new BufferedReader(new FileReader(input00File));

		File input05File = new File("../../test-cases/input/input05.txt");
		BufferedReader brInput05 = new BufferedReader(new FileReader(input05File));


		String st;
		int currentLine = 0;
		String lineSplit[];

		int arr00[] = null;

		int arr05[] = null;

		while((st = brInput00.readLine()) != null){
			if(currentLine == 1){
				arr00 = Arrays
						.stream(st.split(" "))
						.mapToInt(Integer::parseInt)
						.toArray();

			}
			currentLine++;
		}

		currentLine = 0;

		while((st = brInput05.readLine()) != null){
			if(currentLine == 1){
				arr05 = Arrays
						.stream(st.split(" "))
						.mapToInt(Integer::parseInt)
						.toArray();
						
			}
			currentLine++;
		}

		// problem application

		int response00 = MigratoryBirds.run(arr00);
		int response05 = MigratoryBirds.run(arr05);
		

		// expected outputs

		File output00File = new File("../../test-cases/output/output00.txt");
		BufferedReader brOutput00 = new BufferedReader(new FileReader(output00File));

		File output05File = new File("../../test-cases/output/output05.txt");
		BufferedReader brOutput05 = new BufferedReader(new FileReader(output05File));


		int output00 = 0;
		int output05 = 0;

		while((st = brOutput00.readLine()) != null){
			output00 = Integer.parseInt(st.trim());
		}

		while((st = brOutput05.readLine()) != null){
			output05 = Integer.parseInt(st.trim());
		}

		System.out.println(((response00 == output00) ? ANSI_GREEN : ANSI_RED) + "INPUT 00");
		System.out.println(((response05 == output05) ? ANSI_GREEN : ANSI_RED) + "INPUT 05" + ANSI_RESET);
	}
}