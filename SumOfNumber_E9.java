package com.mazher;
import java.util.Scanner;

//completed and tested

public class SumOfNumber_E9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		new calSum().calculateSum(sc.nextInt());
	}
}
class calSum{
	void calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		System.out.println("Sum of Natural Number divisible by 3 or 5 : "+sum);
	}
}