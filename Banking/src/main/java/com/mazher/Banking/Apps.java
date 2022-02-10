package com.mazher.Banking;

import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Apps {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ApplicationContext  context = new ClassPathXmlApplicationContext("context.xml");
		Activity dao = context.getBean("activity", Activity.class);	
		Apps ref = new Apps();
		ref.Menu(dao);
		
		
	}
	
	
	void Menu(Activity dao) {
		
		System.out.println();
		String[] arr = {"1. Create Account",
                "2. View Statement",
                "3. Deposit Money",
                "4. Withdraw Money",
                "5. Transfer Money",
                "6. Close Application"};
          
		for(String val:arr) {
			System.out.println(val);
			}
		System.out.println("\nEnter your Choice: ");
		int choice = input.nextInt();
		switch(choice) {
			
			case 1:
				dao.createAccount();
				Menu(dao);
				break;
			case 2:
				System.out.println("Id   Name   Balance   Deposit_Date   Withdraw_Date  Money_Transfer Transfer_Date");
				List<UserAccount> sts = dao.viewStatement();
				for(UserAccount val:sts) {
					System.out.println(val.getId()+
							"    "+val.getName()+
							"    "+val.getBalance()+
							"        "+val.getDeposit_Date()+
							"       "+val.getWithdraw_Date()+
							"       "+val.getMoney_Transfer()+
							"             "+val.getTransfer_Date());
				}
				Menu(dao);
				break;
			case 3:
				dao.depositMoney();
				Menu(dao);
				break;
			case 4:
				dao.withdrawMoney();
				Menu(dao);
				break;
			case 5:
				dao.transferMoney();
				Menu(dao);
				break;
			case 6:
				dao.close();
				break;
		}
		
		
	}
}
