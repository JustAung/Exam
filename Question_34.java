package FINALEXAM;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Question_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    DecimalFormat d = new DecimalFormat("0.##");
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter a double-floating point number:");
		double result = Scan.nextDouble();
		result = Math.sqrt(result);
		System.out.println("The result is: "+result);
		System.out.println("Formatted result is: "+d.format(result));
	}
}
