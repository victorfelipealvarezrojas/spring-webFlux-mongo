package com.valvarez.spwebflux.repository;

import com.valvarez.spwebflux.entity.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {}
