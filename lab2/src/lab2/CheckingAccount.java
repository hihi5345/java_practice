package lab2;

public class CheckingAccount extends Account {
	private double credit_limit;
	private double interest;
	private double loan_interest;
	public CheckingAccount(double m, double cl, double in, double loan) {
		super(m);
		credit_limit=-cl;
		interest=in;
		loan_interest=loan;
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
	@Override
	public double getWithdrawableAccount() {
		// TODO Auto-generated method stub
		if(getBalance()-credit_limit >= 0){
			return getBalance()-credit_limit;
		} else {
			return 0.0;
		}
	}
	@Override
	public void passTime(int t) {
		// TODO Auto-generated method stub
		if(getBalance()>=0){
			setBalance(getBalance()*Math.pow((1+interest),t));
		} else {
			
			setBalance(getBalance()*Math.pow((1+loan_interest),t));
		}
	}
	public boolean isBankrupted(){
		if(getBalance() >= credit_limit)	return true;
		else	return false;
	}
}
