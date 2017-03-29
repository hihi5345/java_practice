package lab2;

public class Account {
	private double balance;
	public Account(double m){
		balance=m;
	}
	public void credit(double m){
		balance+=m;
	}
	public String debit(double m){
		if(balance<m)	return "Debit amount exceeded account balance.\n";
		else{
			balance-=m;
			return null;
		}
	}
	public double getBalance(){
		return balance;
	}
	protected void setBalance(double m){
		balance = m;
	}

}
