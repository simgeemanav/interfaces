package interfaces;

public class HibernateCustomerDao implements CustomerDao{

	@Override
	public void add(Customer customer) {
         System.out.println(customer.getName() + " Hibernate ile eklendi");		
	}

}
