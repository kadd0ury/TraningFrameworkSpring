package com.service;
import java.util.List;

import com.entity.*;

public interface  CustomerSer {
	
	
	
	public List < Customer > getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);
	
	
	

}
