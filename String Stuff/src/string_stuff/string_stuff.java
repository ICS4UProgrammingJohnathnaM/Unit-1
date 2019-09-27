package string_stuff;
import java.io.*;


public class string_stuff {

	public static void main(String[] args) {
		
		String line = "null";
		String fileOutput;
		String RunArray[] = new String[15];
		
		FileReader fileReader = new FileReader("DATA.txt");
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);

	            while((line = bufferedReader.readLine()) != null) {
	                fileOutput = line;
	            }
	            bufferedReader.close();  
		
		
		
		char[] RunArray = fileOutput.toCharArray();
		int run = 1;
		if (RunArray[0] == "") {
			lblAnswer.Text = "0";
			
		}
		for (int runNum = 0; RunArray[runNum] == RunArray[runNum + 1]; runNum++) {
			run++;
		}
		
		
	}

}
public static String MaxRun(String str){
    int counter = 0;
    int length = str.length();
    int tmpMaxRun = 1;
    int maxRun = 1;
    String output = "";
    char[] running = str.toCharArray();
    
    if (str == "") {
        System.out.println("Max run is 0; No input given");
        output = "Max run is 0; No input given";
        return output;
        }
    
    //main loop
    while (counter < length - 1) {
        //increment counter right away
        counter++;

        //if the current letter is the same as the previous, increase the current run count
        if (running[counter] == running[counter - 1] ) {
                tmpMaxRun++;
                }
        //otherwise, reset it to 1
        else {
                tmpMaxRun = 1;
            }
        //if the current run count is larger than the previous max, replace it
        if (tmpMaxRun > maxRun) {
            maxRun = tmpMaxRun;
        }
    }
    
    output = "" + maxRun;
    
    return output;
}
}