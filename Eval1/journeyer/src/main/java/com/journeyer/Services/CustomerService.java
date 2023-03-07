package com.journeyer.Services;

import java.util.List;

import com.journeyer.modal.Customer;
import org.springframework.data.jpa.repository.Query;

public interface CustomerService {


	public Customer getByEmail(String email);

	public List<Customer> getcustomerbyid(int cust_Id);
	 
	//public String getallcustomers(Customer customer);
	
	public Customer getcustomerbycustid(int cust_Id);
	
	public List<Customer> getAllCustomer();

}
