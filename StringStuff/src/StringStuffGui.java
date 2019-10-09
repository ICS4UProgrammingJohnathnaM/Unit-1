/*
 * Created by: Johnathan Meloche
 * Created on: 02-October-2019
 * Created for: ICS4U
 * Assignment #1b (String Stuff)
 * This is a program that calculates max run
*/

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import java.io.*;		//for input/outputting files
import java.util.*;		//for using a list
import java.lang.*;		//for checking whitespace

public class StringStuffGui {

	protected Shell shlStringStuff;
	private Text txtFileName;
	private Text txtOutputText;

	List<String> Lines = new ArrayList<String>();
	List<String> Output = new ArrayList<String>();

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			StringStuffGui window = new StringStuffGui();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlStringStuff.open();
		shlStringStuff.layout();
		while (!shlStringStuff.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlStringStuff = new Shell();
		shlStringStuff.setSize(544, 207);
		shlStringStuff.setText("Max Run Program");

		txtFileName = new Text(shlStringStuff, SWT.BORDER);
		txtFileName.setToolTipText("Input .txt File Name");
		txtFileName.setBounds(10, 10, 387, 21); 
		
		txtOutputText = new Text(shlStringStuff, SWT.BORDER);
		txtOutputText.setToolTipText("Input the name of the desired Output File");
		txtOutputText.setBounds(10, 128, 387, 21);
		
		Button btnGetFile = new Button(shlStringStuff, SWT.NONE);
		btnGetFile.addSelectionListener(new SelectionAdapter() {
			@Override
			//Function played when GET FILE is clicked
			public void widgetSelected(SelectionEvent e) {
				
				Lines.clear();
				 // The name of the file to open.
		        String fileName = txtFileName.getText();

		        // This will reference one line at a time
		        String line = null;

		        try {
		            // FileReader reads text files.
		            FileReader fileReader = 
		                new FileReader(fileName);

		            // Always wrap FileReader in BufferedReader as per Tutorial.
		            BufferedReader bufferedReader = 
		                new BufferedReader(fileReader);

		            while((line = bufferedReader.readLine()) != null) {
		                System.out.println(line);
		                Lines.add(line);
		            }   

		            // Always close files.
		            bufferedReader.close();         
		        }
		        catch(FileNotFoundException ex) {
		            System.out.println(
		                "Unable to open file '" + 
		                fileName + "'");                
		        }
		        catch(IOException ex) {
		            System.out.println(
		                "Error reading file '" 
		                + fileName + "'");             
		        }
			}
		});
		btnGetFile.setBounds(423, 8, 75, 25);
		btnGetFile.setText("Find File");
		
		Button btnCalculate = new Button(shlStringStuff, SWT.NONE);
		btnCalculate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//use the max run function for every string
				for (int i = 0; Lines.size() > i; i++) {
					String inputs = Lines.get(i);
					Output.add(MaxRun(inputs));
				}
				
			}
		});
		btnCalculate.setBounds(133, 51, 106, 51);
		btnCalculate.setText("Calculate");
		
		Button btnSendText = new Button(shlStringStuff, SWT.NONE);
		btnSendText.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				//File name
				String fileName = txtOutputText.getText();
				
				//create a file
				try {
		            // Assume default encoding.
		            FileWriter fileWriter =
		                new FileWriter(fileName);

		            // Always wrap FileWriter in BufferedWriter.
		            BufferedWriter bufferedWriter =
		                new BufferedWriter(fileWriter);

		            // Note that write() does not automatically
		            // append a newline character.
		            for (int i = 0; Output.size() > i; i++) {
						bufferedWriter.write(Output.get(i));
						bufferedWriter.newLine();
					}
		            // Always close files.
		            bufferedWriter.close();
		        }
		        catch(IOException ex) {
		            System.out.println(
		                "Error writing to file '"
		                + fileName + "'");
		            // Or we could just do this:
		            // ex.printStackTrace();
		        }
				
				//write to console
				for (int i = 0; Output.size() > i; i++) {
					System.out.println(Output.get(i));
				}
				//reset the output
				Output.clear();
			}
		});
		btnSendText.setBounds(423, 126, 75, 25);
		btnSendText.setText("Output File");
	}
	
	public static String MaxRun(String str){
		//declaring variables used for Max Run
		int counter = 0;
		int length = str.length();
		
		int maxRun = 1;
		
		String output = "";
		
		//Converting string into character array
		char[] running = str.toCharArray();
		
		//checking if file is empty
		if (Character.isWhitespace(running[0]) && running.length == 1) {
			output = "Max run is 0 (Empty Input)";
			return output;
		}
		//Error Checking
		for (int i = 0; i < length; i++) {
			if (Character.isWhitespace(running[i])) {
					output = "There cannot be whitespaces!";
			}
		}
	
		//Max Run Loop
		while (counter < length - 1) {
			counter++;

			int tmpMaxRun = 1;
			//if the current letter is the same as the previous, increment counter
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
