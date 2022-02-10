package com.mazher.Banking;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mazher.Spring_jdbc.Products;
import com.mazher.Spring_jdbc.JDBCOperations.ProductMapper;


@Repository
public class Activity {
	
	static Scanner input = new Scanner(System.in);
	
	DataSource dataSource;
	JdbcTemplate jdbcTemplate;
	String qry;
	String currentDate = java.time.LocalDate.now().toString(); 
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	void createAccount() {
		
		System.out.println("Enter Id: ");
		int Id = input.nextInt();
		input.nextLine();
		System.out.println("Enter Name: ");
		String Name = input.next();
		System.out.println("Enter Amount: ");
		int Balance = input.nextInt();
		String Withdraw_Date = "0000-00-00";
		String Transfer_Date  = "0000-00-00";
		int Money_Transfer = 0 ;
		
		qry = "insert into user_account values(?,?,?,?,?,?,?)";
		jdbcTemplate.update(qry,new Object[] {Id,Name,Balance,currentDate,Withdraw_Date,Money_Transfer,Transfer_Date});
		System.out.println("Inserted Successfully");
		
	}
	
	List<UserAccount> viewStatement() {
		qry = "select * from user_account";
		List<UserAccount> sts = jdbcTemplate.query(qry,new UserAccountMapper());
		return sts;
		
		
	}
	
	void depositMoney() {
		System.out.println("Enter Name: ");
		String name = input.next();
		System.out.println("Enter Amount:");
		int amount = input.nextInt();
		qry = "update user_account set Balance = Balance + ? , Deposit_Date = ? where Name=?";
		jdbcTemplate.update(qry,new Object[] {amount,currentDate,name});
		System.out.println("Amount added Successfully");
	}
	
	void withdrawMoney() {
		System.out.println("Enter Name: ");
		String name = input.next();
		System.out.println("Enter Amount:");
		int amount = input.nextInt();
		qry = "update user_account set Balance = Balance - ? , Withdraw_Date = ? where Name=?";
		jdbcTemplate.update(qry,new Object[] {amount,currentDate,name});
		System.out.println("Amount Withdraw Successfully");
	}
	
	
	void transferMoney() {
		System.out.println("Enter Name: ");
		String name = input.next();
		System.out.println("Enter Amount:");
		int amount = input.nextInt();
		System.out.println("Enter Recipient Name:");
		String reci = input.next();
		qry = "update user_account set Balance = Balance - ? , Withdraw_Date = ? , Money_Transfer = Money_Transfer + ?, Transfer_Date = ? where Name=?";
		jdbcTemplate.update(qry,new Object[] {amount,currentDate,amount,currentDate,name});
		String qry2 = "update user_account set Balance = Balance + ?, Deposit_Date = ? where Name=? ";
		jdbcTemplate.update(qry2,new Object[] {amount,currentDate,reci});
		System.out.println("Money Transfer Successfully");
	}
	
	
	void close() {
		System.out.println("Closing Application....");
	}
	
	
	class UserAccountMapper implements RowMapper<UserAccount>{
		@Override
		public UserAccount mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			UserAccount theUser = new UserAccount();
				theUser.setId(rs.getInt("Id"));
				theUser.setName(rs.getString("Name"));
				theUser.setBalance(rs.getInt("Balance"));
				theUser.setDeposit_Date(rs.getString("Deposit_Date"));
				theUser.setWithdraw_Date(rs.getString("WithDraw_Date"));
				theUser.setMoney_Transfer(rs.getInt("Money_Transfer"));
				theUser.setTransfer_Date(rs.getString("Transfer_Date"));
			return theUser;	
		}
	}
	
}
