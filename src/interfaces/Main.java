package interfaces;

public class Main {

	public static void main(String[] args) {
       
		ProductManager productManager = new ProductManager(new HibernateProductDao(), new FileLogger());
		productManager.add(new Product(1,"Elma"));
		
		// Message[] messages2 = {};
		Message[] messages = {new MailLogger(), new SmsLogger()};
		
		
		CustomerManager customerManager = new CustomerManager(new HibernateCustomerDao(), messages);
		customerManager.add(new Customer(2,"Simge"));
		
		
		
	}

}
