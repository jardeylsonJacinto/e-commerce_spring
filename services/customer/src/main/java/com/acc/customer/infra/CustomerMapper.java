package com.acc.customer.infra;

import org.springframework.stereotype.Component;

import com.acc.customer.model.Customer;
import com.acc.customer.utils.CustomerRequest;
import com.acc.customer.utils.CustomerResponse;

@Component
public class CustomerMapper {

  public Customer toCustomer(CustomerRequest request) {
    if (request == null) {
      return null;
    }
    return Customer.builder()
        .id(request.id())
        .firstname(request.firstname())
        .lastname(request.lastname())
        .email(request.email())
        .address(request.address())
        .build();
  }

  public CustomerResponse fromCustomer(Customer customer) {
    if (customer == null) {
      return null;
    }
    return new CustomerResponse(
        customer.getId(),
        customer.getFirstname(),
        customer.getLastname(),
        customer.getEmail(),
        customer.getAddress());
  }
}