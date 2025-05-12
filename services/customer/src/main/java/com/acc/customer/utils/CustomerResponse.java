package com.acc.customer.utils;

import com.acc.customer.model.Address;

public record CustomerResponse(
    String id,
    String firstname,
    String lastname,
    String email,
    Address address) {

}
