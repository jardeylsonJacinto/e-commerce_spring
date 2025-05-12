package com.acc.customer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.acc.customer.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String > {

}
