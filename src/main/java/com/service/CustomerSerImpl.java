package com.service;

import java.util.List;


import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.entity.Customer;
import com.repositories.CustomerRepository;

@Service
public class CustomerSerImpl implements CustomerSer {
	
	
	@Qualifier("CustomerRepository")
	@Autowired
	private CustomerRepository customerrep;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerrep.findAll();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		customerrep.save(theCustomer);
	
		
	}

	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		return customerrep.findById(theId).get();
		

	}

	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		customerrep.deleteById(theId);
		
	
		
	}

}
