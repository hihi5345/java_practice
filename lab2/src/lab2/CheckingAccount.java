package lab2;

public class CheckingAccount extends Account {
	private double credit_limit;
	private double interest;
	private double loan_interest;
	public CheckingAccount(double m) {
		super(m);
		credit_limit=-100.0;
		interest=0.01;
		loan_interest=0.07;
	}
	public double nextMonth(){
		if(balance>=0){
			balance = balance*(1+interest);
		} else {
			balance = balance*(1+loan_interest);
		}
		return balance;
	}
	@Override public String debit(double m){
		if(balance - m < credit_limit){
			return "no more!!";
		} else {
			balance -= m;
			if(balance<0){
				return "minus!!";
			}
			return null;
		}
	}
}
