package FINALEXAM;

import java.util.Scanner;

public class Question_35 {
	
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = Scan.nextInt();
		if(age<=17) {
			System.out.println("Your a minor");
		}
		else
			System.out.println("Your a adult");
		System.out.println("Enter your birthyear: ");
		int DOB = Scan.nextInt();
		if(DOB<=2003) {
			System.out.println("Your a minor");
		}
		else
			System.out.println("Your a adult");
	}
}