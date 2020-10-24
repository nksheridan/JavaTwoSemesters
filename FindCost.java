import java.util.Scanner;
//package to help with keyboard input

public class FindCost {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//create object keyboard of scanner class (system.in) represents keyboard in java
		
		double price, tax;
		System.out.println ("*** Product Price Check***");
		System.out.println ("Enter product price: ");
		price = keyboard.nextDouble(); //input method
		System.out.println ("Enter tax rate: ");
		tax = keyboard.nextDouble(); //input method
		price = price * (1 + tax/100); //calculate using variables
		System.out.println ("Cost after tax = " + price);
		

	}

}
