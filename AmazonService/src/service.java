
public class service {

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.name = "Komal";
		c1.address="Latur";
		c1.email="k@gmail.com";
		c1.mobno=923567892;
		
		Order o1 = new Order();
		o1.productName="EarBuds";
		o1.productPrice=2499;
		
		
		AmazonService az = new AmazonService();
		
		String out1 = az.loginSuccess(c1);
		String out2 = az.orderConfirm(o1);
		
		System.out.println(out1);
		System.out.println(out2);
		
	}
}

class Customer
{
	String name;
	String address;
	String email;
	long mobno;
}

class Order
{
	String productName;
	int productPrice;
}


class AmazonService
{
	String loginSuccess(Customer c1)
	{
		return"You log in successfully!";
	}
	
	String orderConfirm(Order o1)
	{
		return"Your order confirmed";
	}
}
