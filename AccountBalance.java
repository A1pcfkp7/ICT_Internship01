import java.util.*;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double balance = 1000.0; // Initial account balance
        System.out.println("Current Balance: " + balance);
        
        System.out.print("Enter the amount to withdraw: ");
        double withdrawalAmount = sc.nextDouble();
        
        if (withdrawalAmount > balance) {
            System.out.println("Error: Insufficient balance. Cannot withdraw.");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal successful.");
            System.out.println("Updated Balance: " + balance);
        }
        
        sc.close();
    }
}
