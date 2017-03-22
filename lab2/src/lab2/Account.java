package lab2;

public class Account {
	public String name;
	private double money;
	public void credit(double m){
		money+=m;
	}
	public void debit(double m){
		if(money<m)	System.out.println("Debit amount exceeded account balance.\n");
		else{
			money-=m;
		}
	}
	public void balance(){
		System.out.printf("%s balance : %.2f\n",name, money);
	}
	public Account(String N){
		name=N;
	}

}
