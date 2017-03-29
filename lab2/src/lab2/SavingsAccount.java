package lab2;

public class SavingsAccount extends Account {
	private double interest;
	private int month;
	public SavingsAccount(double m, double in){
		super(m);
		interest = in;
	}
	@Override public String debit(double m){
		if(month<12)	return "아직 출금할 수 없습니다.";
		else{
			if(getBalance()-m < 0)	return "no more!!";
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
		return getBalance();
	}
	@Override
	public void passTime(int t) {
		// TODO Auto-generated method stub
		month+=t;
		if(month==12)	setBalance(getBalance()*Math.pow((1+interest),12));
	}

}
