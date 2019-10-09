/*
 * Created by: Johnathan Meloche
 * Created on: 09/12/19
 * Created for: ICS4U
 * Day #5 (Einstein's Equation)
 * This program Calculates Energy using Einsteins Equation with the input being the mass in KG
*/
package default_package;
import java.util.Scanner;
public class EinsteinsEquation {
	
	public static void main(String[] args) {
		//SPEED OF LIGHT
		final double c = 299792458;
		//Energy
		double E;
		//Mass
		double m;


		//Prompt
		System.out.println("Einsteins Equation Calculator");
		System.out.print("Input the mass in KG: ");
		
		
		Scanner value = new Scanner(System.in);
		m = value.nextDouble();
		E = m * c *c;
		System.out.println(Double.toString(E) + " Joules");
		
	}

}
