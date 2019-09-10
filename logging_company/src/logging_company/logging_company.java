/*
 * Created by: Johnathan Meloche
 * Created on: 06/09/2019
 * Created for: ICS4U
 * Day #3 (Logging Company)
 * This program asks the user the lengths of the logs and calculates based on the length how much can fit in the truck
*/
package logging_company;
import java.util.Scanner;

public class logging_company {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double smallLog = 0.25;
		double mediumLog = .5;
		double largeLog = 1;
		double numberOfLogs;
		double weightOfLog;
		final double MAX_WEIGHT = 1100;
		final double WEIGHT_PER_METER = 20;
		

		System.out.print("Input size of logs in metres: ");
		
		Scanner userInputScan = new Scanner(System.in);
		String userInputString = userInputScan.nextLine(); 
		double userInput = Double.parseDouble(userInputString);
		if (userInput == smallLog)
		{
			weightOfLog = WEIGHT_PER_METER * smallLog;
			numberOfLogs = MAX_WEIGHT / weightOfLog;
			System.out.println(Double.toString(numberOfLogs));
		}
		else if (userInput == mediumLog)
		{
			weightOfLog = WEIGHT_PER_METER * mediumLog;
			numberOfLogs = MAX_WEIGHT / weightOfLog;
			System.out.println(Double.toString(numberOfLogs));
		}
		else if (userInput == largeLog)
		{
			weightOfLog = WEIGHT_PER_METER * largeLog;
			numberOfLogs = MAX_WEIGHT / weightOfLog;
			System.out.println(Double.toString(numberOfLogs));
		}
		else {
			System.out.println("Invalid Input! Please input .25, .5 or 1");
		}
	}

}
