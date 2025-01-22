package com.eazybytes.accounts.controller;

import com.eazybytes.accounts.entity.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    public ResponseEntity<?> saveCustomer(Customer customer) {
        return  new ResponseEntity<>(customer, null);
    }
}
