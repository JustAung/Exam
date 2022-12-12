package FINALEXAM;

import java.util.Scanner;

public class Question_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a workday number: ");
		int day = scan.nextInt();
		switch(day) {
		case 1: 
			System.out.println("Monday");
			break;
		case 2: 
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wednesday");
			break;
		case 4: 
			System.out.println("Thursday");
			break;
		case 5:	
			System.out.println("Friday");
			break;
		default:
			System.out.println("Holiday");
			}
	}

}
