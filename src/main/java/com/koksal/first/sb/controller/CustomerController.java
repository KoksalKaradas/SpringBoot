package com.koksal.first.sb.controller;

import com.koksal.first.sb.models.Customer;
import com.koksal.first.sb.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;

	
	@GetMapping
	public List<Customer> list() {
		return customerRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Customer customer) {
		customerRepository.save(customer);
	}

	@GetMapping("/{id}")
	public Customer get(@PathVariable("id") long id) {
		return customerRepository.getOne(id);
	}

}
