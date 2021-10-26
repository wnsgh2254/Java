class Account 
{
	String account;
	int balance;;
	double interestRate;
	
	public Account(String account, int balance, double interestRate) 
	{
		this.account= account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	void setAccount(String account) 
	{
		this.account = account;
	}
	
	String getAccount() 
	{
		return this.account;
	}
	
	int getBalance() 
	{
		return this.balance;
	}
	
	double calculateInterest () 
	{
		return this.interestRate = this.balance * (this.interestRate/100.0);
	}
	
	void deposit(int money) 
	{
		this.balance = this.balance + money;
	}
	
	void withdraw(int money) 
	{
		this.balance = this.balance - money;
	}
	
}



public class bank {

	public static void main(String[] args) {
		Account ac = new Account("441-0290-12-3", 500000, 7.3);
		System.out.println("계좌정보 : " + ac.account + "현재잔액" + ac.balance);
		ac.deposit(20000);
		System.out.println("계좌정보 : " + ac.account + "현재잔액" + ac.balance);
		System.out.println(ac.calculateInterest());

	}

}
