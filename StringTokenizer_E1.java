package com.mazher;
import java.util.Scanner;
import java.util.StringTokenizer;

//completed and tested

public class StringTokenizer_E1 {

	public static void main(String[] args) {
		int totalSum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers with space gap:");
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()) {
        	int n;
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            totalSum = totalSum + n;
        }
        System.out.println("sum of integers is: " + totalSum);
        sc.close();

	}

}
