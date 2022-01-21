package com.mazher.cricketapi;

import java.util.ArrayList;
import java.util.Scanner;

public class CricketerAPI {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Cricketer> listOfCricketers = new ArrayList<>();
	public static void main(String[] args) {
		
		Cricketer theCricketer = new Cricketer("viratkholi", "Batsman", "India");
		listOfCricketers.add(new Cricketer("RishabhPant", "Wicketkeeper/Batsman", "India"));
		listOfCricketers.add(new Cricketer("RickyPonting", "Batsman", "Australia"));
		listOfCricketers.add(theCricketer);
		listOfCricketers.add(new Cricketer("JaspritBumrah", "Bowler", "India"));
		choice();	
	}
	
	public static void choice() {
		System.out.println();
		String[] arr1 = {"1. Add New Cricketar",
                "2. View all cricketar",
                "3. Update cricketar details",
                "4. delete cricketar",
                "5. exit"};
		for(String val:arr1) {
			System.out.println(val);
			}
		System.out.println();
		System.out.println("Enter your choice: ");
		int choice2 = input.nextInt();
		switch(choice2) {
				case 1:
					cricketarAdd();
					choice();
					break;
				case 2:
					seeCricketar();
					choice();
					break;
				case 3:
					updateCricketar();
					choice();
					break;
				case 4:
					deleteCricketar();
					choice();
					break;
				case 5:
					closeApp();
					break;
				default:
					System.out.println("Invalid input, try again");
					choice();
			
		}
	}
	
	public static void cricketarAdd() {
		String name,speaciality,country;

		System.out.println("Enter the Cricketar Name:");
		name = input.next();
		
		System.out.println("Enter the Cricketar Speciality:");
		speaciality = input.next();
		
		System.out.println("Enter the Cricketar Country:");
		country = input.next();
		listOfCricketers.add(new Cricketer(name,speaciality,country));
		System.out.println("Cricketar Added Successfully");
			
	}
	public static void seeCricketar() {
		listOfCricketers.forEach((cricketer) -> System.out.println(cricketer));
	}
	
	public static void updateCricketar() {
		System.out.println("Enter Cricketar Name, Whose data you want to update:");
		String u = input.next();
		System.out.println("Enter the Cricketar Speciality:");
		String s = input.next();
		System.out.println("Enter the Cricketar Country:");
		String c = input.next();
		
		for(Cricketer cric : listOfCricketers) {
			if(cric.getName().equals(u)) {
				listOfCricketers.set(
						listOfCricketers.indexOf(cric),
							new Cricketer(cric.getName(),
								s,c));
			}
		}
		System.out.println("Cricketar data update successfully");
		listOfCricketers.forEach((cricketer) -> System.out.println("After updating : " + cricketer));
		
	}
	
	public static void deleteCricketar() {
		
		System.out.println("Enter the Cricketar Name, Data you want to delete:");
		String name = input.next();
			for(Cricketer cric: listOfCricketers) {
				if(cric.getName().equals(name)) {
					
					listOfCricketers.remove(listOfCricketers.indexOf(cric));
					break;
				}
				
			}
		

		System.out.println("Cricketar Data deleted successfully");
	}
	
	public static void closeApp() {
		System.out.println("\tClosing Application..... \n\tthankyou...");
	}
}



class Cricketer {
	private String name;

	private String speciality;

	private String country;

	Cricketer() {

	}

	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", speciality=" + speciality + ", country=" + country + "]";
	}

	public Cricketer(String name, String speciality, String country) {
		this.name = name;
		this.speciality = speciality;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
