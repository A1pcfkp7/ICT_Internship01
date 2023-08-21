import java.util.*;

public class Banking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double balance = 500.0;
		System.out.println("Current Balance:" + balance);

		System.out.print("Enter the amount to withdraw:");

		double withdrawAmount = sc.nextDouble();

		if (withdrawAmount > balance) {
			System.out.println("Error: Insufficient balance cannot withdraw");
		} else {
			balance = -withdrawAmount;
			System.out.println("Withdrawal successful.");

		}
		sc.close();

	}
}
