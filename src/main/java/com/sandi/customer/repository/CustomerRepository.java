package com.sandi.customer.repository;

import com.sandi.customer.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
