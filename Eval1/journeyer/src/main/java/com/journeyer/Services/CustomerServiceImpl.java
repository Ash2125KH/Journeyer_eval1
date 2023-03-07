package com.journeyer.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.journeyer.modal.Customer;
import com.journeyer.repository.Customerrepo;

@Service
public class CustomerServiceImpl implements CustomerService
{

	@Autowired
	Customerrepo custrepo;

	@Override
	public List<Customer> getcustomerbyid(int cust_Id) {
		// TODO Auto-generated method stub
		return custrepo.findBycustomerid(cust_Id);
	}
	
	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub	
		return custrepo.findAll();
	}
	
	@Override
	public Customer getcustomerbycustid(int cust_Id) {
		// TODO Auto-generated method stub
		return custrepo.findBycustomercid(cust_Id);
	}

	public Customer getByEmail(String email){
		return custrepo.getByEmail(email);
	}
}