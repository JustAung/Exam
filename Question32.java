package FINALEXAM;

import java.util.ArrayList;

public class Question32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arraylist1 = new ArrayList<String>();
		arraylist1.add("Aung");
		System.out.println(arraylist1);
		ArrayList<String> arraylist2 = new ArrayList<String>();
		arraylist2.add("Pay");
		System.out.println(arraylist2);
		arraylist1.addAll(arraylist2);
		System.out.println(arraylist1);
		System.out.println(arraylist1.contains("Thet"));
	}

}
