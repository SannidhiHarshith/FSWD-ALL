package com.klu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.model.Customer;
import com.klu.repository.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo cr;
	
	//create
	  public Customer addCustomer(Customer customer) {
	        return cr.save(customer);
	    }
	  
	// READ ALL
	    public List<Customer> getAllCustomers() {
	        return cr.findAll();
	    }
	    
	 // READ BY ID
	    public Customer getCustomerById(Long id) {
	        return cr.findById(id).orElse(null);
	    }
	    
	  //update
	    public Customer updateCustomer(Long id, Customer customer) {
	        Customer existing = cr.findById(id).orElse(null);

	        if (existing != null) {

	            if (customer.getName() != null) {
	                existing.setName(customer.getName());
	            }
	            if (customer.getEmail() != null) {
	                existing.setEmail(customer.getEmail());
	            }
	            return cr.save(existing);
	        }

	        return null;
	    }
	    
	 // DELETE
	    public void deleteCustomer(Long id) {
	        cr.deleteById(id);
	    }

	    
	    
}
