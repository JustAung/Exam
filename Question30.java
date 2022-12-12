package FINALEXAM;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ID;
		Scanner Scan = new Scanner(System.in);
		System.out.println("ID:");
		ID = Scan.nextInt();
		switch(ID) {
		case 100:
			System.out.println("There is no break");
		case 200:
			System.out.println("There is a break");
			break;
		case 300:
			System.out.println("Example");
		}
	}

}
