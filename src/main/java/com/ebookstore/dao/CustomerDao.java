package com.ebookstore.dao;

import com.ebookstore.model.Customer;

public interface CustomerDao {

	Customer getCustomerById(int id);

	void addCustomer(Customer customer);

	void deleteCustomer(int id);

	void modifyCustomer(Customer customer);

	Customer getCustomerByuserName(String userName);
}
