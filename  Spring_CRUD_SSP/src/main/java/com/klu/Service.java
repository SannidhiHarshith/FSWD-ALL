package com.klu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


@org.springframework.stereotype.Service
public class Service {
	@Autowired
	Repo r;
	
	public String insertData(Product product) {
		r.save(product);
		return "Data Saved Successfully";
	}
	
	public List<Product> retrivedata()
	{
		return r.findAll();
	}
	
	public String updateData(Product product) {
		if(r.existsById(product.getId())) {
			r.save(product);
		return "Data Updated Successfully";
		}else {
			return "product is not exists";
		}
	}
	
	// Delete
    public String deleteData(int id) {
        if (r.existsById(id)) {
            r.deleteById(id);
            return "Data deleted successfully";
        } else {
            return "Product not found";
        }
    }
}
