package com.mazher;
import java.util.Scanner;

//completed and tested

public class SumCubeDigit_E5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SumCubeDigit_E5 ref = new SumCubeDigit_E5();
		ref.sumOfCubeOfDigit(input.nextInt());
	}
	void sumOfCubeOfDigit(int number) {
		int totalSum=0,temp;
		while(number>0) {
			temp=number%10;
			totalSum = totalSum + (temp*temp*temp);
			number = number/10;
		}
		System.out.println("Sum : "+totalSum);
	}
}
