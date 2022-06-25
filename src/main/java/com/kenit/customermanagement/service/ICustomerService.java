package com.kenit.customermanagement.service;

import com.kenit.customermanagement.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findALl();

    void save(Customer customer);

    Customer findById(int id);

    void remove(int id);

    void update(int id, Customer customer);
}
