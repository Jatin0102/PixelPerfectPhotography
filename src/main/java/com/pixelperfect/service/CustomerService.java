package com.pixelperfect.service;

import java.util.List;

import com.pixelperfect.entity.Customer;

public interface CustomerService {

    Customer saveCustomer(Customer customer);

    List<Customer> getAllCustomers();

    Customer getCustomerById(Long customerId);

    Customer updateCustomer(Customer customer);

    void deleteCustomer(Long customerId);

}