
public class Bank {
	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		
		c1.setName("Komal");
		c1.setAddress("Latur");
		c1.setEmail("k@gmail.com");
		c1.setMobno(1234567891);
		c1.setAge(17);
		
		BankService bs= new BankService();
		String out = bs.openAccount(c1);
		
		System.out.println(out);
	}
}

class Customer
{
	private String name;
	private String address;
	private String email;
	private long mobno;
	private int age;
	
	
	public String getName()
	{
		return name;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	
	
	public String getAddress()
	{
		return address;
	}
	
	void setAddress(String address)
	{
		this.address=address;
	}
	
	public String getEmail()
	{
		return email;
	}
	void setEmail(String email)
	{
		this.email=email;
	}
	
	public long getMobno()
	{
		return mobno;
	}
	void setMobno(long mobno)
	{
		this.mobno=mobno;
	}
	
	public int getAge()
	{
		return age;
	}
	void setAge(int age)
	{	
		this.age=age;
	}
	
}

class BankService
{
	public String openAccount(Customer c1)
	{
		if(c1.getAge()>18)
		{	
			return "Your account is opened";
		}
		
		return "Your account is not opened";
		
	}
}
