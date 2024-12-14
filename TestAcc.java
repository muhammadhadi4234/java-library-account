package theoryAssignment;
import java.util.Scanner;
public class TestAcc {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
//		String id = sc.nextLine();
//		String name=sc.nextLine();
//		double accBalance= sc.nextDouble();
		LibraryAccount a1 = new LibraryAccount("A-011", "Muhammaad hadi",100.0);
		LibraryAccount a2 = new LibraryAccount("A-042", "Abdul Bari", 40000.78);
	//	Scanner sc = new Scanner(System.in);
		System.out.println("Initial Accout Details: ");
		a1.displayInfo();
		System.out.println("\n****************************");
		System.out.println("Details of Another Account:");
		a2.displayInfo();
		System.out.println("\nAdding funds to the account");
		System.out.println("\nEnter the ammount you want to send Account 1: ");
		double amm1 = sc.nextDouble();
		a1.addFunds(amm1);
		System.out.println("\nAdding Ammount to Account 2, Enter Amount: ");
		double amm2 = sc.nextDouble();
		a2.addFunds(amm2);
		System.out.println();
		
		System.out.println("Updated Account details:");
		a1.displayInfo();
		System.out.println();
		a2.displayInfo();
	sc.close();
	}

}
