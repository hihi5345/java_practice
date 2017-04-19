package lab2;

public class Car implements Valuable{
	private String name;
	private double price;
	public Car(String name, double price){
		this.name = name;
		this.price = price;
	}
	@Override
	public double EstimateValue(int month) {
		// TODO Auto-generated method stub
		return price*0.8*Math.pow(0.99, month);
	}
	public double EstimateValue(){
		return EstimateValue(1);
	}
	@Override
	public String toString(){
		return String.format("car name:"+name+"\ninitial price:"+price);
	}
}
