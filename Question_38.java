package FINALEXAM;

import java.util.ArrayList;
import java.util.Random;

public class Question_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> AL1 = new ArrayList<Integer>();
		ArrayList<Integer> AL2 = new ArrayList<Integer>();

		Random generator = new Random();
		for(int i = 0; i<10; i++) {
			AL1.add(generator.nextInt(30));
			AL2.add(generator.nextInt(30));
			System.out.println("Arraylist 1: "+AL1);
			System.out.println("Arraylist 2: "+AL2);
		}
		System.out.println(AL1);	
		for(int i=0;i<AL1.size();i++) {
			System.out.println("The element "+AL1.get(i)+ " Index: "+i);
		}
	}	

}
