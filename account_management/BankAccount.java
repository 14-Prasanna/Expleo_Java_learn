package account_management;

import java.util.*;

// AccountManagement all the methods are re-assigned 
class AccountManagement {
	private String AccountId;
	private String name;
	private int balance = 0;

	// constructor calls only one time, when the new account creation..
	AccountManagement(String AccountId, String name) {
		this.AccountId = AccountId;
		this.name = name;
	}

	// Constructor to assign the values in the fields act as an Encapsulation
	AccountManagement(String AccountId, String name, int balance) {
		this.AccountId = AccountId;
		this.name = name;
		this.balance = balance;
	}

	// to display all the fields
	public void displayAccountDetails() {
		System.out.println(this.toString());
	}

	
	public String getAccountId() {
		return AccountId;
	}

	public String getName() {
		return name;
	}

	public int getbalance() {
		return balance;
	}

	// Validate Account by ID everyTime
	public AccountManagement validateCredit(ArrayList<AccountManagement> l1, String id) {
		for (AccountManagement acc : l1) {
			if (acc.getAccountId().equals(id)) {
				return acc;
			}
		}
		return null;
	}

	// CREDIT
	public void credit(int amount, String id) {

		if (amount < 100) {
			System.out.println("100 ruba kuda ila aprm ethuku da unku bank");
		} else {
			this.balance += amount;
			System.out.println("Amount credited successfully");
			System.out.println("Updated Balance: " + this.balance);
		}
	}

	// DEBIT
	public int debit(int amount) {
		

		if (amount > this.balance) {
			System.out.println("Amount exceeded balance");
		} else {
			this.balance -= amount;
			System.out.println("Amount debited successfully");
		}

		return this.balance;
	}

	// TRANSFER
	public int transferTo(AccountManagement another, int amount) {

		if (amount > this.balance) {
			System.out.println("Amount exceeded balance");
		} else {
			this.balance -= amount;
			another.balance += amount;
			System.out.println("Transfer successful");
		}

		return this.balance;
	}

	// toString
	public String toString() {
		return "Account ID: " + AccountId + "\nName: " + this.name + "\nBalance: " + balance;
	}
}

// MAIN CLASS
public class BankAccount {

	static int counter = 1;
	static final String PREFIX = "PRASANNA_BANK_";

	static String generateId() {
		return PREFIX + String.format("%02d", counter++);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("-----------Welcome to the world of Prsanna Bank... -----\n");

		System.out.println("1. Account Creation ");
		System.out.println("2. Credit Operation ");
		System.out.println("3. Debit Operation ");
		System.out.println("4. Fund Transfer");
		System.out.println("5. Account Display");
		System.out.println("0. Exit");

		ArrayList<AccountManagement> accounts = new ArrayList<>();
		AccountManagement a1 = null;

		while (true) {
			System.out.println("\nEnter your choice:");
			int cp = sc.nextInt();

			if (cp == 0) {
				System.out.println("Thank you for Using prasanna Bank visit again");
				break;
			}

			switch (cp) {
			case 1:
				System.out.println("Enter your name:");
				String s1 = sc.nextLine();

				sc.nextLine();
				String id = generateId();

				AccountManagement ac1 = new AccountManagement(id, s1);
				accounts.add(ac1);

				System.out.println("Account created successfully");
				System.out.println("Your Account ID: " + id);
				break;

			case 2:
				System.out.println("Enter AccountID:");
				String id1 = sc.next();

				a1 = new AccountManagement("", "");
				AccountManagement foundAcc = a1.validateCredit(accounts, id1);

				if (foundAcc != null) {
					System.out.println("Current balance: " + foundAcc.getbalance());
					System.out.println("Enter amount to credit:");
					int amot = sc.nextInt();
					foundAcc.credit(amot, id1);
				} else {
					System.out.println("Account not found.");
				}
				break;

			case 3:
				System.out.println("Enter AccountID:");
				String did = sc.next();

				a1 = new AccountManagement("", "");
				AccountManagement debitAcc = a1.validateCredit(accounts, did);

				if (debitAcc != null) {
					System.out.println("Enter amount to debit:");
					int damount = sc.nextInt();
					debitAcc.debit(damount);
				} else {
					System.out.println("Account not found.");
				}
				break;

			case 4:
				System.out.println("Enter From AccountID:");
				String fromId = sc.next();

				System.out.println("Enter To AccountID:");
				String toId = sc.next();

				a1 = new AccountManagement("", "");

				AccountManagement fromAcc = a1.validateCredit(accounts, fromId);
				AccountManagement toAcc = a1.validateCredit(accounts, toId);

				if (fromAcc != null && toAcc != null) {
					System.out.println("Enter amount to transfer:");
					int tAmount = sc.nextInt();
					
					if(tAmount >=fromAcc.getbalance()) {
						System.out.println("Un aacount la kasu ila pa...");
					}
					else {
					fromAcc.transferTo(toAcc, tAmount);}
				} else {
					System.out.println("Invalid Account ID(s)");
				}
				break;

			case 5:
				System.out.println("Enter AccountID:");
				String dispId = sc.next();

				a1 = new AccountManagement("", "");
				AccountManagement dispAcc = a1.validateCredit(accounts, dispId);

				if (dispAcc != null) {
					dispAcc.displayAccountDetails();
				} else {
					System.out.println("Account not found.");
				}
				break;

			default:
				System.out.println("Invalid choice");
			}
		}

		sc.close();
	}
}
