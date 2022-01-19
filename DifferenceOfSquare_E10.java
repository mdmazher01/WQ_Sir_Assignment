package com.mazher;
import java.util.Scanner;

//completed and tested

public class DifferenceOfSquare_E10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		other ref = new other();
		ref.calculateDifference(sc.nextInt());
	}
}
class other{
	void calculateDifference(int n) {
		int sum1=0,sum2=0;
		int i=1;
		int diff=0;
		while(i<=n) {
			sum1+=(i*i);
			sum2+=i;
			i++;
		}
		sum2=sum2*sum2;
		diff=sum1-sum2;
		System.out.println("Difference is: "+diff);
	}
}