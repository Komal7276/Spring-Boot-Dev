
public class Test {
	
	public static void main(String[] args) {
	
		
		/*SavingAccount sa = new SavingAccount();
		
		System.out.println(sa.bankName);
		System.out.println(sa.location);
		System.out.println(sa.type);
		sa.printMbalance();*/
		
		AccountService as = new AccountService();
		
		System.out.println(as.bankName);
		System.out.println(as.location);
		System.out.println(as.type);
		as.printMbalance();
		
		
		
	}
}

class AccountService
{
	String bankName="SBI";
	String location="Latur";
	String type="Account"; 
	
	public void printMbalance()
	{
		System.out.println("500");
	}
}

class SavingAccount extends AccountService
{
	public void printMbalance()
	{
		System.out.println("1000");
	}
}
