package com.pixelperfect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pixelperfect.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}