package com.koksal.first.sb.repositories;

import com.koksal.first.sb.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
