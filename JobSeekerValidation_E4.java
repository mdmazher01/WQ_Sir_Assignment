package com.mazher;
import java.util.Scanner;

//completed and tested

public class JobSeekerValidation_E4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		new JobSeekerValidation_E4().StringVal(input.next());
		
		
	}
	void StringVal(String str) {
		String RemainingChar,lastFourChar;
		String match ="_job";
		RemainingChar = str.substring(0,str.length()-4);
		lastFourChar = str.substring(str.length()-4);
		if(RemainingChar.length()>=8 && lastFourChar.equals(match)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
	}
}


