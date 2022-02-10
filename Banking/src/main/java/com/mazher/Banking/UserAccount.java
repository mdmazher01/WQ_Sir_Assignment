package com.mazher.Banking;

public class UserAccount {
	
	
	private int Id;
	private String Name;
	private int Balance;
	private String Deposit_Date;
	private String Withdraw_Date;
	private int Money_Transfer;
	private String Transfer_Date;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		this.Balance = balance;
	}
	public String getDeposit_Date() {
		return Deposit_Date;
	}
	public void setDeposit_Date(String deposit_Date) {
		Deposit_Date = deposit_Date;
	}
	public String getWithdraw_Date() {
		return Withdraw_Date;
	}
	public void setWithdraw_Date(String withdraw_Date) {
		Withdraw_Date = withdraw_Date;
	}
	public int getMoney_Transfer() {
		return Money_Transfer;
	}
	public void setMoney_Transfer(int money_Transfer) {
		Money_Transfer = money_Transfer;
	}
	public String getTransfer_Date() {
		return Transfer_Date;
	}
	public void setTransfer_Date(String transfer_Date) {
		Transfer_Date = transfer_Date;
	}
	
	UserAccount(){
		
	}
	
	public UserAccount(int id, String name, int balance, String deposit_Date, String withdraw_Date, int money_Transfer,
			String transfer_Date) {
		super();
		Id = id;
		Name = name;
		this.Balance = balance;
		Deposit_Date = deposit_Date;
		Withdraw_Date = withdraw_Date;
		Money_Transfer = money_Transfer;
		Transfer_Date = transfer_Date;
	}
	
	@Override
	public String toString() {
		return "UserAccount [Id=" + Id + ", Name=" + Name + ", balance=" + Balance + ", Deposit_Date=" + Deposit_Date
				+ ", Withdraw_Date=" + Withdraw_Date + ", Money_Transfer=" + Money_Transfer + ", Transfer_Date="
				+ Transfer_Date + "]";
	}

	
	
	
	
	
	
	
}

