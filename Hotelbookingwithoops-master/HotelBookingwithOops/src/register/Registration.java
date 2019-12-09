package register;

import customer.Customer;

public class Registration {
	Customer customer = new Customer();
	public static int registerID;
	
	public void registration(String firstName,String middleName,String lastName,String email,String contact) {
		
	customer.setFirstName(firstName);
    customer.setMiddleName(middleName);
    customer.setLastName(lastName);
    customer.setEmail(email);
    customer.setContact(contact);
    System.out.println("\nThanks for Registering and your register ID is "+ ++registerID);
    System.out.println("\nYour details are ");
    this.display(customer);
    
	}
	private void display(Customer customer)
	{
		System.out.println("        Name     : "+customer.getFirstName());
		System.out.println("        Contact  : "+customer.getContact());
		System.out.println("        Email    : "+customer.getEmail());
	}
	public void emailUpdate(String email,int register)
	{
		
		customer.setEmail(email);
		this.display(customer);
		//System.out.println("Updated Email "+customer.getEmail());
		
	}
}
