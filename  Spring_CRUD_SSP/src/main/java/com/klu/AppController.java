package com.klu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@CrossOrigin
public class AppController {
	
	@Autowired
	Service s;
	
	
	@PostMapping("product")
	public String postMethodName(@RequestBody Product product) {
		//TODO: process POST request
		
		return s.insertData(product);
	}
	
	 @GetMapping("product")
	 public List<Product> retrive() {
	 	return  s.retrivedata();
	 }
	 
	 @PutMapping("/product")
	 public String updateProduct(@RequestBody Product product) {
		 return s.updateData(product);
	 }
	 
	 @DeleteMapping("/product/{id}")
	 public String deleteProduct(@PathVariable int id) {
		 return s.deleteData(id);
	 }
	 

}
