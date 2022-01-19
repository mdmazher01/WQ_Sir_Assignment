package com.mazher;
import java.util.Scanner;

//completed and tested

public class PositiveString_E2 {
	public static void main(String[] args) {
		PositiveString_E2 ref = new PositiveString_E2();
		ref.positiveString();
		
	}
	void positiveString() {
		boolean flag = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scan.nextLine();
		for(int i=1;i<str.length();i++) {
			if((str.charAt(i))>(str.charAt(i-1))) {
				flag = true;
			}
			else {
				flag = false;
			}
		}
		if (!flag) {
			System.out.println("Given String is Negative");
			
		}
		else {
			System.out.println("Given String is Positive");
		}
	}

}
