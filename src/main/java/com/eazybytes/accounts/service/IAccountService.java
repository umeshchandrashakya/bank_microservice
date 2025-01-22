package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.AccountsDto;
import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.entity.Customer;

public interface IAccountService {

    void createAccount(CustomerDto customerDto);


    CustomerDto fetchAccountDetails(String accountNumber);
}
