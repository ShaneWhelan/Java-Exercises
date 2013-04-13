public class Exercise08_07 {

	public static void main (String[] args) {
		Account1 account = new Account1(1112, 20000);
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("Balance is " + account.getBalance());
		System.out.println("Monthly interest is " + account.getMonthlyInterest());
		System.out.println("This account was created at " + account.getDateCreated());
	}
}

class Account1{
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	java.util.Date date = new java.util.Date();
	
	public Account1(){
	}
	
	public Account1(int userID, double userBal){
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