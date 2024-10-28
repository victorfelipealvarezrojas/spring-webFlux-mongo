package com.valvarez.spwebflux.service;

import com.valvarez.spwebflux.dto.EmployeeDto;
import reactor.core.publisher.Mono;


public interface EmployeeService {
    Mono<EmployeeDto> saveEmployee(EmployeeDto employee);
    Mono<String> getEmployee(String id);
    Mono<String> updateEmployee(String id, EmployeeDto employee);
    Mono<String> deleteEmployee(String id);
}
