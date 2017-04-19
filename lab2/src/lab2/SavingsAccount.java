package lab2;

public class SavingsAccount extends Account implements Valuable {
	private double interest;
	private int month;
	public SavingsAccount(double m, double in){
		super(m);
		interest = in;
	}
	@Override public void debit(double m) throws Exception{
		if(month<12)	throw new Exception("아직 출금할 수 없습니다.");
		else{
			if(m<0){
				throw new Exception("음수입력!");
			} if(getBalance() - m < 0){
				throw new Exception("Debit amount exceeded account balance.");
			}else {
				setBalance(getBalance()-m);
			}
		}
	}
	@Override
	public void credit(double m){
		return;
	}
	@Override
	public double getWithdrawableAccount() {
		// TODO Auto-generated method stub
		return getBalance();
	}
	@Override
	public void passTime(int t) {
		// TODO Auto-generated method stub
		if(month<12 && month+t>=12)	setBalance(getBalance()*Math.pow((1+interest),12));
		month+=t;
	}
	public void passTime(){
		passTime(1);
	}
	@Override
	public double EstimateValue(int month) {
		// TODO Auto-generated method stub
		return getBalance() * Math.pow(1+interest, month);
	}
	public double EstimateValue(){
		return EstimateValue(1);
	}
	@Override
	public String toString(){
		return String.format("SavingsAccount_Balance:"+getBalance());
	}
}
