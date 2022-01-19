package com.mazher;

import java.util.Arrays;
import java.util.Scanner;


//completed and tested

public class UpperLower_E6 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.next();
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr.length%2==0) {
				while(i<(arr.length)/2) {
					System.out.println(arr[i].toUpperCase());
					i++;
				}
				System.out.println(arr[i].toLowerCase());
			}
			else {
				while(i<=(arr.length)/2) {
					System.out.println(arr[i].toUpperCase());
					i++;
				}
				System.out.println(arr[i].toLowerCase());
			}
				
		}

	}

}
