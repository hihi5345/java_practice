package lab2;

public class CheckingAccount extends Account {
	private double credit_limit;
	private double interest;
	private double loan_interest;
	public CheckingAccount(double m) {
		super(m);
		credit_limit=-100;
		interest=0.01;
		loan_interest=0.07;
	}
	public double nextMonth(){
		if(getBalance()>=0){
			setBalance(getBalance()*(1+interest));
		} else {
			setBalance(getBalance()*(1+loan_interest));
		}
		return getBalance();
	}
	@Override public String debit(double m){
		if(getBalance() - m < credit_limit){
			return "no more!!";
		} else {
			setBalance(getBalance()-m);
			if(getBalance()<0){
				return "minus!!";
			}
			return "";
		}
	}
}
