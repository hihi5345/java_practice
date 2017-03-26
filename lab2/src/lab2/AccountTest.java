package lab2;
import java.util.Scanner;
public class AccountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CheckingAccount account1 = new CheckingAccount(100.00);
		CheckingAccount account2 = new CheckingAccount(100.00);
		System.out.printf("%s balance : %.2f\n","account1", account1.getBalance());
		System.out.printf("%s balance : %.2f\n","account2", account2.getBalance());
		System.out.print("Enter deposit amount for account1 : ");
	    double num1 = input.nextDouble();
		account1.credit(num1);
		System.out.printf("%s balance : %.2f\n","account1", account1.getBalance());
		System.out.printf("%s balance : %.2f\n","account2", account2.getBalance());
		System.out.print("Enter withdrawal amount for account2 : ");
	    double num2 = input.nextDouble();
	    System.out.println("");
	    System.out.println(account2.debit(num2));
	    System.out.printf("%s balance : %.2f\n","account1", account1.getBalance());
		System.out.printf("%s balance : %.2f\n","account2", account2.getBalance());
		System.out.println("");
	    System.out.println("next month!");
	    account1.nextMonth();
	    account2.nextMonth();
	    System.out.printf("%s balance : %.2f\n","account1", account1.getBalance());
		System.out.printf("%s balance : %.2f\n","account2", account2.getBalance());
	}

}
