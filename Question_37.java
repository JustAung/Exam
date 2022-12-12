package FINALEXAM;

import java.util.Scanner;

public class Question_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		if(num%2==0) {
			System.out.println("Your number is an even number");
			{
				if(num>10)
					System.out.println("Your number is greater than 10");
				if(num<10)
					System.out.println("Your number is less than 10");
			}
		}
		else if(num%2!=0) {
			System.out.println("Your number is an odd number");
			{
				if(num>10)
					System.out.println("Your number is greater than 10");
				if(num<10)
					System.out.println("Your number is less than 10");
			}
		}
		else
			System.out.println("Invalid");
	}
}
