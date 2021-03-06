package lab2;

public abstract class Account implements Valuable {
	private double balance;
	public Account(double m){
		balance=m;
	}
	public void credit(double m){
		balance+=m;
	}
	public void debit(double m) throws Exception{
		balance -= m;
	}
	public double getBalance(){
		return balance;
	}
	public abstract double getWithdrawableAccount();
	public abstract void passTime(int t);
	public void passTime(){
		passTime(1);
	}
	protected void setBalance(double m){
		balance = m;
	}

}
