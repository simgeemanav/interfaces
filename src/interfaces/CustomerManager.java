package interfaces;

public class CustomerManager {
	
	private CustomerDao customerDao ;
	private Message[] messages;

	public CustomerManager(CustomerDao customerDao, Message[] messages) {
		super();
		this.customerDao = customerDao;
		this.messages = messages;
	}

	public void add(Customer customer) {
		customerDao.add(customer);
		for(Message message: messages) {
			message.sendMessage(customer.getName());
		}
		
	}
	
	

}
