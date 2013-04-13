public class Exercise11_03 {

	public static void main (String[] args) {
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println(account.toString());
		
		SavingsAccount saccount = new SavingsAccount(1123, 1000);
		saccount.withdraw(2000);
		System.out.println(saccount.toString());

		CheckingAccount caccount = new CheckingAccount(1124, 1000);
		caccount.withdraw(2000);
		System.out.println(caccount.toString());
	}
}

class Account{
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	java.util.Date date = new java.util.Date();
	
	public Account(){
	}
	
	public Account(int userID, double userBal){
		id = userID;
		balance = userBal;
	}
	
	public void setID(int userID){
		id = userID;
	}
	
	public int getID(){
		return id;
	}
	
	public void setBal(double userBal){
		if(userBal > 0){
			userBal = balance; 
		}
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setAnnualInterestRate(double annualIntrest){
		annualInterestRate = annualIntrest;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public String getDateCreated(){
		return date.toString();
	}
	
	public double getMonthlyInterest(){
		return (((balance / 100) * annualInterestRate) / 12);
	}
	
	public void withdraw(double draw){
		balance = balance - draw;
	}
	
	public void deposit(double add){
		balance = balance + add;
	}
	
	public String toString(){
		return "Created on: " + getDateCreated() + "\nID: " + getID() + "\nBalance " + getBalance();
	}
}

class SavingsAccount extends Account{
	
	SavingsAccount(){
		super();
	}
	
	SavingsAccount(int userID, double userBal){
		super(userID, userBal);
	}
	
	public void withdraw(double draw){
		if(getBalance() >= draw){
			setBal(getBalance() - draw);
		}else{
			System.out.println("Error cannot overdraw");
		}
	}
	
}

class CheckingAccount extends Account{
	
	CheckingAccount(){
		super();
	}
	
	CheckingAccount(int userID, double userBal){
		super(userID, userBal);
	}
	
	public void withdraw(double draw){
		if(800 >= draw){
			setBal(getBalance() - draw);
		}else{
			System.out.println("Error cannot overdraw that much");
		}
	}	
}