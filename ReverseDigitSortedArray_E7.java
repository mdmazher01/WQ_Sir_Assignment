package com.mazher;
import java.util.Arrays;


//completed and tested

public class ReverseDigitSortedArray_E7 {

	public static void main(String[] args) {
		int []array = {12,40,50};
		getSorted(array);

	}
	static void getSorted(int array[]) {
		int reverse_number=0;
		int []intArray = new int[array.length];
		for(int i=0;i<array.length;i++) {
			while(array[i] != 0) {
				int digit = array[i] % 10;
			    reverse_number = reverse_number * 10 + digit;
			      array[i] /= 10;
			    }
			    intArray[i]=reverse_number;
			    reverse_number=0;
		}
		Arrays.sort(intArray);
		for(int val:intArray) {
			System.out.println(val);
		}
		
		
	}

}
