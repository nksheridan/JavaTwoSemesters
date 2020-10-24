import java.util.Scanner;
//package to help with keyboard input

public class FindBMI {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//create object keyboard of scanner class (system.in) represents keyboard in java
		
		
		System.out.println ("*** BMI Calculator***");
		System.out.println ("Enter your weight: ");
		double weight = keyboard.nextDouble(); //input method
		System.out.println ("Enter your height: ");
		double height = keyboard.nextDouble(); //input method
		double BMI = weight / (height * height); //calculate using variables
		System.out.println ("BMI = " + BMI);
		

	}

}
