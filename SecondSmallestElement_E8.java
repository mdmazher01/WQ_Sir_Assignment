package com.mazher;
import java.util.*;
//completed and tested

public class SecondSmallestElement_E8 {
	public static void main(String[] args) {
		int []arr = {0,1,2,3,4,5};
		System.out.println("Second Smallest Element: "+getSecondSmallest(arr));
	}
	public static int getSecondSmallest(int []arr) {
		Arrays.sort(arr);
		return arr[1];
	}
}
