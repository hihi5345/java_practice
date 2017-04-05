package lab2;

public class ValuableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Valuable[] objectList = new Valuable[4];
		objectList[0] = new CheckingAccount(100,50,0.01,0.07);
		objectList[1] = new SavingsAccount(100,0.05);
		objectList[2] = new Human("Mark",20);
		objectList[3] = new Car("MyCar",5000);
		for(Valuable objectItem : objectList){
			System.out.printf("%s \n", objectItem.toString());
			System.out.printf("6 month later Valuable : %.2f\n\n",objectItem.EstimateValue(6));
		}
	}

}
