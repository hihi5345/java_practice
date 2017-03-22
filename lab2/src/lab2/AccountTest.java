package lab2;
import java.util.Scanner;
public class AccountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account account1 = new Account("account1");
		Account account2 = new Account("account2");
		account1.credit(50.00);
		account2.credit(0.00);
		account1.balance();
		account2.balance();
		System.out.print("Enter withdrawal amount for account1 : ");
	    double num1 = input.nextDouble();
		account1.debit(num1);
		account1.balance();
		account2.balance();
		System.out.print("Enter withdrawal amount for account2 : ");
	    double num2 = input.nextDouble();
		account2.debit(num2);
		account1.balance();
		account2.balance();

	}

}
