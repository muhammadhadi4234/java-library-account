package theoryAssignment;

public class LibraryAccount {
	String accountId;
	String accHolderName;
	double accBalance;
	
	LibraryAccount(String accountId, String accHolderName, double accBalance){
	this.accountId = accountId;
	this.accHolderName =	accHolderName;
	this.accBalance = accBalance;
	}
	void addFunds(double f)
	{
		
		if(f > 0) {
		accBalance=accBalance+f;
		System.out.println("Funds Added Successfully");
		}
		else {
			System.out.println("Enter the amount greater than 0 ");
		}
	}
	void displayInfo()
	{
		System.out.println("Account Holder Name: " + accHolderName);
		System.out.println("Account ID: " + accountId);
		System.out.println("Account Balance: " + accBalance+" $");
		}
}
