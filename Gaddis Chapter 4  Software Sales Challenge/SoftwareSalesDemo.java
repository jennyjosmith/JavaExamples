	package chapter4;
/* Jenny Jo Beushausen
* Chapter 4 
* Programming Challenge 4
* Software Sales Demo  Program 
*/

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * SoftwareSalesDemo Program
 */

public class SoftwareSalesDemo {
	public static void main(String[] args) {
		int unitsSold; // Holds units sold
		

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the units sold.
		System.out.print("Enter the units sold: ");
		unitsSold = keyboard.nextInt();

		// Create a SoftwareSales object.
		SoftwareSales sales = new SoftwareSales(unitsSold);

		// Display purchase info.
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		System.out.println("Units sold: " + sales.getUnitsSold());
		System.out.println("Discount: $" + dollar.format(sales.getDiscount()));
		System.out.println("Cost: $" + dollar.format(sales.getCost()));
	}
}
