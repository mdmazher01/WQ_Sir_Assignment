package com.mazher;
import java.util.Scanner;

//completed and tested

public class PowerOfTwo_E12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if(checkNumber(sc.nextInt())) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	static boolean checkNumber(int n) {
		return (Math.ceil((Math.log(n) / Math.log(2)))) 
				== (int)(Math.floor(((Math.log(n) / Math.log(2)))));
			}
}
