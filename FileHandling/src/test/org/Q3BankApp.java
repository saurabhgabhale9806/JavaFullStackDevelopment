package test.org;
import java.util.*;

public class Q3BankApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SavingAccount save=new SavingAccount();
		
		do {
			System.out.println("***************Bank Application***************");
			System.out.println("case 1. add account number and balance");
			System.out.println("case 2. Deposite Amount");
			System.out.println("case 3. WithDraw Amount");
			System.out.println("case 4. Display Interest");
			System.out.println("case 5. Exit Code");
			System.out.println("Enter Your Choice: ");
			
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
					System.out.println("Enter the account number");
					sc.nextLine();
					String AccNo=sc.nextLine();
					System.out.println("Enter the balance in account");
					double amo=sc.nextDouble();
					save=new SavingAccount(AccNo,amo);
				
				break;
			case 2:
				
					System.out.println("enter the amount to be deposite");
					double d = sc.nextDouble();
					
					save.deposite(d);
				break;
			case 3:
				
				System.out.println("enter the amount to be withdraw");
				double w = sc.nextDouble();
				save.withdraw(w);
				break;
				
			case 4:
				save.applyIntrest();
				break;
				
			case 5:
				System.out.println("Exiting Code....");
				System.exit(0);
				break;
			}
			
		}while(true);
	}
}