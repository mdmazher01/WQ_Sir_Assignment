package com.mazher;
import java.time.LocalDate;
import java.time.Period;

//completed and tested

public class DateDifference_E3 {
	public static void main(String[] args) {
		DateDifference_E3 ref = new DateDifference_E3();
		ref.DateDifference(LocalDate.of(2021, 12, 31));

	}
	void DateDifference(LocalDate entereddate) {
		LocalDate presentdate = LocalDate.now();
		System.out.println("Entered Date: "+entereddate);
		System.out.println("Present Date: "+presentdate);
		Period p = Period.between(entereddate, presentdate);
		System.out.println("Difference: "+"Days:"+p.getDays()+" Months:"+p.getMonths()+" Years:"+p.getYears());
	}

}
